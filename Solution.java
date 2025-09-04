class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {

    public TreeNode sortedArrayToBST(int[] nums) {
        return buildBST(nums, 0, nums.length - 1);
    }

    private TreeNode buildBST(int[] nums, int left, int right) {
        if (left > right) return null; // Base case

        int mid = left + (right - left) / 2; // To prevent overflow
        TreeNode root = new TreeNode(nums[mid]); // Middle element as root

        root.left = buildBST(nums, left, mid - 1); // Left subtree
        root.right = buildBST(nums, mid + 1, right); // Right subtree

        return root;
    }

    // Helper method to print tree in pre-order traversal
    public void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Main method for testing
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] nums = {-10, -3, 0, 5, 9};

        TreeNode root = obj.sortedArrayToBST(nums);

        System.out.println("Preorder Traversal of the constructed BST:");
        obj.preorder(root);
    }
}
