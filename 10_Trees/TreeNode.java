import java.util.*;
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    /**
     * Performs level-order traversal of a binary tree.
     * Returns a list where each element is a list containing values of nodes at that level.
     * param root The root node of the binary tree
     * return A list of lists containing node values grouped by level
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result; // Handle edge case: empty tree
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        // Process tree level by level
        while (!queue.isEmpty()) {
            // List to store current level's node values
            List<Integer> currentLevel = new ArrayList<>();
            // Get the number of nodes at current level
            int levelSize = queue.size();
            // Process all nodes at current level
            for (int i = 0; i < levelSize; i++) {
                // Remove and process the front node
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);
                // Add left child to queue for next level processing
                if (currentNode.left != null) queue.offer(currentNode.left);
                // Add right child to queue for next level processing
                if (currentNode.right != null) queue.offer(currentNode.right);
            }
            result.add(currentLevel); // Add current level to the result
        }
        return result;
    }
}

// !ANOTHER BETTER APPROACH
// ---------------------------
// class Solution {
//     public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> result = new ArrayList<>();
//         traverse(root,0,result);
//         return result;
//     }
//     private void traverse(TreeNode node,int level,List<List<Integer>> result){
//         if(node==null) return;
//         if(result.size()==level) result.add(new ArrayList<>());

//         result.get(level).add(node.val);
//         traverse(node.left,level+1,result);
//         traverse(node.right,level+1,result);
//     }
// }