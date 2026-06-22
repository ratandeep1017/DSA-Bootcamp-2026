class Preorder {
    List<Integer> result = new ArrayList<>();
    public List<Integer> preorder(TreeNode root) {
        if (root == null) return result;
        result.add(root.val); // System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
        return result;
    }
}
// 1 2 4 5 3