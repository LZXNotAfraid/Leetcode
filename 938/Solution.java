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
    public int rangeSumBST(TreeNode root, int L, int R) {
        return getSum(root, L, R);
    }
    
    public int getSum(TreeNode root, int L, int R){
        
        if(root == null)
            return 0;
        else
            System.out.println(root.val);
        if(root.val <= R && root.val >= L){
            System.out.println("加了" + root.val);
            return root.val + getSum(root.left, L, R) + getSum(root.right, L, R);
        }else if(root.val < L){
            System.out.println("jia l right" + root.val);
            return getSum(root.right, L, R);
        }else{
            System.out.println("jia l left" + root.val);
            return getSum(root.left, L, R);
        }
    }
}