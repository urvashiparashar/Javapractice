//binary tree has max 2 childrens
//root is called node and subnodes are called left and right child
//leaf node: nodes with no child
public class Binary_treeimple {
	
	static class Node
	{
		int data;
	    static Node left;
	    static Node right;
	    
	    Node(int data)
	    {
	    	this.data=data;
	    	this.right=null;
	    	this.left=null;
	    }
	}
	
	static class Binarytree
	{
		static int idx=-1;
		public static Node buildtree(int nodes[])
		{
			idx++; //incrementing idx
			if(nodes[idx]==-1)
			{
				return null;
			}
			Node newnode=new Node(nodes[idx]);
			newnode.left=buildtree(nodes);
			newnode.right=buildtree(nodes);
			return newnode;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Binarytree bt=new Binarytree();
		Node root=bt.buildtree(nodes);
		System.out.println(root.data);

	}

}
