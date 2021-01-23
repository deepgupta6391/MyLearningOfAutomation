package ds;

import java.util.LinkedList;
import java.util.Queue;

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
class SymmetricTree {
	
	/**
	 * Recursive method
	 * @param root
	 * @return
	 */
    public boolean isSymmetricRecursive(TreeNode root) {
        if(root==null)
            return true;
        return isMirror(root.left,root.right);
    }
    
    public boolean isMirror(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        
        return (p.val==q.val) && isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }
    
    
    
}

class SymmetricTreeIterativeSolution{
	public boolean isSymmetric(TreeNode root) {
	
		Queue<TreeNode> q=new LinkedList<>();
		q.add(root);
		q.add(root);
		
		while(!q.isEmpty()) {
			TreeNode t1=q.poll();
			TreeNode t2=q.poll();
			
			if(t1==null && t2==null) continue;
			if(t1==null || t2==null) return false;
			if(t1.val!=t2.val) return false;
			
			q.add(t1.left);
			q.add(t2.right);
			q.add(t1.right);
			q.add(t2.left);
			
			
		}
		return true;
	}
}