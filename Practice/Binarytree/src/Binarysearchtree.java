import java.util.ArrayList;

//properties of binary tree
//1. left subtree<root
//2. right subtree>root
//3. left and right subtree are also bst with no duplicates
//search time complexity: O(H)
//skewed tree: where nodes are only on one side
//time complexity for skewed trr: O(n) where n is the length
public class Binarysearchtree {
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int data)
		{
			this.data=data;
			
		}
	}

	public static Node insert(Node root,int val)
	{
		if(root==null)
		{
			root=new Node(val); 
			return root; //only if no node is there
		}
		if(root.data>val)
		{
			//insert at left subtree
			root.left=insert(root.left, val);
		}
		else
		{
			//insert at right
			
			root.right=insert(root.right, val);
			
		}
		return root;
	}
	public static void inorder(Node root)
	{
		if(root==null)
		{
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	//search a bst:
	//if root>key: go in left subtree
	//if root<key: go in right subtree
	//root==key : found element
	
	public static boolean searchinbst(Node root,int key)
	{
		if(root==null)
		{
			return false;
		}
		if(root.data>key)
		{
			//key is smaller
			return searchinbst(root.left, key);
		}
		else if(root.data==key)
		{
			return true;
		}
		else
		{
			//key is greater
			return searchinbst(root.right, key);
		}
	}
	
	public static Node inordersuccessor(Node root)
	{
		//loop to find leftmost child
		while(root.left!=null)
		{
			root=root.left;
		}
		return root;
	}
	
	//inorder successor : leftmost in right subtree
	public static Node delete(Node root,int val)
	{
		if(root.data>val)
		{
			root.left=delete(root.left, val);
		}
		else if(root.data<val)
		{
			root.right=delete(root.right, val);
		}
		else
		{
			//root.data==val
			//case 1: no child(leaf node)
			if(root.left==null && root.right==null)
			{
				return null;
			}
			//case 2: one child
			//left is null
			if(root.left==null)
			{
				return root.right;
			}
			if(root.right==null)
			{
				return root.left;
			}
			//case 3: find inorder successor
			Node is=inordersuccessor(root.right);
			root.data=is.data; //assign root data as same as in data
			//delete inorder successor
			root.right=delete(root.right, is.data);
		}
		return root;
	}
	
	//print in range:
	//1. x<root<y : search in right and left subtree
	//2. x>root : search in right subtree
	//3. y<root : search in left subtree
	
	
	public static void printinrange(Node root,int x,int y)
	{
		//base case
		if(root==null)
		{
			return ;
		}
		if(root.data>=x && root.data<=y)
		{
			//search in left and right subtree
			printinrange(root.left, x, y);
			System.out.print(root.data+" ");
			printinrange(root.right, x, y);
		}
		else if(root.data>=y)
		{
			//search in left subtree
			printinrange(root.left, x, y);
		}
		else
		{
			//search in right subtree : root.data <=x
			printinrange(root.right, x, y);
		}
	}
	
	public static void printpath(ArrayList<Integer>path)
	{
		for(int i=0;i<path.size();i++)
		{
			System.out.print(path.get(i)+" ");
		}
		System.out.println();
	}
	
	//printpathtoleaf
	public static void printtopath(Node root,ArrayList<Integer>path)
	{
		if(root==null)
		{
			return ;
		}
		//show paths while traking in arraylists
		///preorder traversal as we need to print root first
		//adding to path
		path.add(root.data);
		//leaf node
		if(root.left==null && root.right==null)
		{
			printpath(path);
		}
		else
		{  //non-leaf nodes
		printtopath(root.left, path);
		printtopath(root.right, path);
		}
		//empty path for backtracking
		path.remove(path.size()-1); //from back
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int val[]= {5,1,3,4,2,7,10,11,14};
		Node root=null;
		for(int i=0;i<val.length;i++)
		{
			root=insert(root, val[i]);
		}
//		inorder(root);
//		System.out.println();
//		if(searchinbst(root, 1))
//		{
//			System.out.println("found");
//		}
//		else
//		{
//			System.out.println("not found");
//		}
//		delete(root, 4);
		inorder(root);
		System.out.println();
		printinrange(root, 3, 12);
		System.out.println();
		printtopath(root, new ArrayList<>());

	}

}
