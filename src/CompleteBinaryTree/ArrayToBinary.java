package CompleteBinaryTree;

/**
 * Created by dyenug001c on 12/10/2015.
 *
 * This is a sorted array, we construct binary tree out of it usinhg recursion
 */
public class ArrayToBinary {
    // Definition for binary tree
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public TreeNode sortedArrayToBST(int[] num) {
            if (num.length == 0)
                return null;

            return sortedArrayToBST(num, 0, num.length - 1);
        }

        public TreeNode sortedArrayToBST(int[] num, int start, int end) {
            if (start > end)
                return null;

            int mid = (start + end) / 2;
            TreeNode root = new TreeNode(num[mid]);
            root.left = sortedArrayToBST(num, start, mid - 1);
            root.right = sortedArrayToBST(num, mid + 1, end);

            return root;
        }
    }

}
