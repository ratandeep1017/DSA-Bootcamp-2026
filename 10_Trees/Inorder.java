import java.util.*;
public class Inorder {
    List<Integer> result = new ArrayList<>();   
    public List<Integer> inorder(TreeNode root) {
        if (root == null) return result;
        inorder(root.left);
        result.add(root.val); // System.out.print(root.val + " ");
        inorder(root.right);
        return result;
    }
}
// 4 2 5 1 3