

public class UnionFind {

	LinkedList representatives[];

	public UnionFind(int initialNumSets) {
		representatives = new LinkedList[initialNumSets];
		for (int x = 0; x < initialNumSets; x++)
			makeSet(x);
	}

	public void makeSet(int x) { 
		LinkedList LL = new LinkedList();
		LL.insertAtEnd(x);
		representatives[x] = LL;
	}

	public LinkedList find(int x) { 
		return representatives[x];
	}

	private void append(LinkedList arg1, LinkedList arg2) { // complete this function
		arg1.tail.next = arg2.head;
		arg1.tail = arg2.tail;
		arg1.size += arg2.size;
		for (int i = 0; i < arg2.size; i++) {
			int count = 0;
			ListNode cur = arg2.head;
			while (cur != null) {
				if (count == i) {
					representatives[cur.value] = arg1;
				}
				count++;
				cur = cur.next;
			}
		}
		arg2.head = null; arg2.tail = null;
	}

	public void doUnion(int x, int y) { // complete this function
		LinkedList llX = find(x), llY = find(y);
		if (!llX.equals(llY)) {
			if (llX.size >= llY.size) {
				append(llX, llY);
			} else {
				append(llY, llX);
			}
		}
	}
}
