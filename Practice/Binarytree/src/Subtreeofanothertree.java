/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public boolean isidentical(TreeNode root,TreeNode subRoot)
    {
        if(root==null && subRoot==null)
        {
            return true;
            
        }
        if(root==null || subRoot==null)
        {
            return false;
        }
        if(root.val==subRoot.val){
            return isidentical(root.left, subRoot.left) && isidentical(root.right,subRoot.right); //check for subtree in case of non null values
    }
        else
        {
            return false;
        }
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(subRoot==null)
        {
            return true; //if subroot or both roots are null then it will check here
        }
        if(root==null)
        {
            return true; 
        }
        if(root.val==subRoot.val)
        {
            if(isidentical(root,subRoot))
            {
                return true;
            }
        }
        
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
        //if subtree doesnot match then check right and left subtree
    }
}
//public class Subtreeofanothertree {
//
//}
