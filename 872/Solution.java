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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<Integer>();
        List<Integer> l2 = new ArrayList<Integer>();
        getLeaf(root1, l1);
        getLeaf(root2, l2);
        if(l1.size() != l2.size())
            return false;
        else{
            for(int i = 0 ; i < l1.size() ; i ++){
                if(l1.get(i) != l2.get(i))
                    return false;
            }
            return true;
        }
    }
    
    public void getLeaf(TreeNode root, List l){
        if(root.left != null){
            if(root.right == null){
                getLeaf(root.left, l);
            }else{
                getLeaf(root.left, l);
                getLeaf(root.right, l);
            }
        }else{
            if(root.right != null)
                getLeaf(root.right, l);
            else
                l.add(root.val);
        }
    }
}
