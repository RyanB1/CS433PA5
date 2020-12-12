

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
	}

	public void doUnion(int x, int y) { // complete this function
	}
}
