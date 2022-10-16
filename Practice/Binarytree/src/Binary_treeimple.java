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
	
	public static int countnodes(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftnodes=countnodes(root.left);
		int rightnodes=countnodes(root.right);
		
		//formula for countinh number of nodes
		return leftnodes+rightnodes+1;
	}
	
	public static int sumofnodes(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftsum=sumofnodes(root.left); //sum of left subtree
		int rightsum=sumofnodes(root.right); //sum of right subtree
		
		//formula for countinh number of nodes
		return leftsum+rightsum+root.data;
	}
	
	//height can be calculated using deepest leaf location
	public static int height(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		int leftheight=height(root.left);
		int rightheight=height(root.right);
		int myheight=Math.max(leftheight,rightheight)+1;
		
		return myheight;
		
	}
	
	//diameter: number of nodes in longest path between two nodes
	public static int calc_dia(Node root)
	{
		if(root==null)
		{
			return 0;
		}
		//time complexity: O(n^2) so not optimised
		int dia1=calc_dia(root.left);
		int dia2=calc_dia(root.right);
		int dia3=height(root.left)+height(root.right)+1;
		int dia=Math.max(dia3, Math.max(dia1, dia2));
		
		return dia;
	}
	
	static class Treeinfo
	{
		int ht,diameter;
		Treeinfo(int ht,int diameter)
		{
			this.ht=ht;
			this.diameter=diameter;
		}
		
	}
	
	public static Treeinfo diameter2(Node root)
	{
		if(root==null)
		{
			return new Treeinfo(0, 0);
					
		}
		Treeinfo left=diameter2(root.left); //left subtree info
		Treeinfo right=diameter2(root.right); //right subtree info
		
		int myhegight=Math.max(left.ht, right.ht)+1;
		int diam1=left.diameter;
		int diam2=right.diameter;
		int diam3=left.ht+right.ht+1;
		
		int mydia=Math.max(Math.max(diam1, diam2),diam3);
		
		Treeinfo myinfo=new Treeinfo(myhegight, mydia);
		return myinfo;
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
//		levelorder(root);
		
//		System.out.println(countnodes(root));  //time complexity is O(n)
//		System.out.println(sumofnodes(root));
		
//		System.out.println(height(root));
		
		System.out.println(diameter2(root).diameter);

	}

}
