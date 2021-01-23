package ds;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
class LeverOrderTraversal2  {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        
        List<List<Integer>> result =new LinkedList<>();
        
        Queue<TreeNode> queue=new LinkedList<>();
        
        queue.add(root);
        
        while(!queue.isEmpty()){
            
            int len=queue.size();
            
            List<Integer> level=new ArrayList<>();
            
            for(int i=0;i<len;i++){
                
                TreeNode node=queue.poll();
                
                if(node!=null){
                    level.add(node.val);
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
            
            if(!level.isEmpty()){
                result.add(0,level);
            }
            
        }
        return result;
    }
}

