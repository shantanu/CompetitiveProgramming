
public class DisjointSet {
	//The number of elements in the collection
	public int count;
	
	//The parent of each element in the collection
	private int[] parent;
	
	public DisjointSet(int count) {
		this.count = count;
		this.parent = new int[this.count];
		
		//Initially, all the elements are in their own set
		for (int i = 0; i < this.count; i++) {
			this.parent[i] = i;
		}
	}
	
	//Finds the representative of the set that i is an element of
	public int find(int i) {
		//if i is the parent of itself
		if (parent[i] == i) {
			// Then i is the representative of his set
			return i;
		}
		
		else {
			int result = find(parent[i]);
			//we cache the solution by move i's node directly under the representative of his set
			//this path compression is useful
			parent[i] = result;
			return result;
		}
	}
	
	//unites the set that includes i and the set that includes j
	public void Union(int i, int j) {
		// Find the representatives for each nodes.
		int irep = find(i);
		int jrep = find(j);
		
		parent[irep] = jrep;
	}
}
