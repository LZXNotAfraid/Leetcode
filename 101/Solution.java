/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        else{
            return checkSymmetric(root.left, root.right);
        }
    }
    
    public boolean checkSymmetric(TreeNode r1, TreeNode r2){
        if(r1 != null && r2 != null){
            if(r1.val == r2.val){
                return checkSymmetric(r1.left, r2.right) && checkSymmetric(r1.right, r2.left);
            }else{
                return false;
            }
        }else if(r1 == null && r2 == null){
            return true;
        }else{
            return false;
        }
    }
    
}
