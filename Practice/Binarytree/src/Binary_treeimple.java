import java.util.LinkedList;
import java.util.Queue;

//binary tree has max 2 childrens
//root is called node and subnodes are called left and right child
//leaf node: nodes with no child
public class Binary_treeimple {
	
	static class Node
	{
		int data;
	    Node left;
	    Node right;
	    
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
	
	public static void preorder(Node root)
	{
		//1. root
		//2. left subtree
		//3. right subtree
		if(root==null)
		{
			System.out.print(-1+" ");
			return ; //return from that particular point
		}
		//recursion
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
	}
	
	public static void inorder(Node root)
	{
		
		//1. left subtree
		//2. root
		//3. right subtree
		if(root==null)
		{
			System.out.print(-1+" ");
			return ; //return from that particular point
		}
		//recursion
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	public static void postorder(Node root)
	{
		
		//1. left subtree
		//2. right subtree
		//3. root
		
		if(root==null)
		{
			System.out.print(-1+" ");
			return ; //return from that particular point
		}
		//recursion
		
		postorder(root.left);
		
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	
	public static void levelorder(Node root)
	{
		//base case
		if(root==null)
		{
			return;
		}
		Queue<Node>q=new LinkedList<>();
		q.add(root);
		q.add(null);
		
		while(!q.isEmpty())
		{
			Node currnode=q.remove(); //remove this node
			if(currnode==null)
			{
				System.out.println();
				if(q.isEmpty())
				{
					break;
				}
				else
				{
					q.add(null);
				}
			}
			else
			{
				System.out.print(currnode.data+" ");
				if(currnode.left!=null)
				{
					q.add(currnode.left);
				}
				if(currnode.right!=null)
				{
					q.add(currnode.right);
				}
			}
		}
		
		
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		Binarytree bt=new Binarytree();
		Node root=bt.buildtree(nodes);
//		System.out.println(root.data);
//		preorder(root);
//		inorder(root);
//		postorder(root);
		levelorder(root);

	}

}
