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

/*
Create a double list
if the depth is equal to the size then add to the list.
regardless add to to the root.
then traverse to the left and right child
if root is null then just return
*/
class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> levelOrder(TreeNode root) {
        res = new ArrayList<>();
        populate(root, 0);

        return res;
    }

    public void populate(TreeNode root, int depth){
        if(root == null){
            return;
        }
        if(depth == res.size()){
            res.add(new ArrayList<>());
        }
        res.get(depth).add(root.val);
        populate(root.left, depth + 1);
        populate(root.right, depth + 1);
    }
}
