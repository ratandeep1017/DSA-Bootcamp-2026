class Postorder {
    List<Integer> result = new ArrayList<>();
    public List<Integer> postorder(TreeNode root) {
        if (root == null) return result;
        postorder(root.left);
        postorder(root.right);
        result.add(root.val); // System.out.print(root.val + " ");
        return result;
    }
}
// 4 5 2 3 1