public class Main {
    // Definition for binary tree node
    static class TreeNode {
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

    // Custom list implementation to avoid imports
    static class IntList {
        int[] elements;
        int size;
        
        IntList() {
            elements = new int[16];
            size = 0;
        }
        
        void add(int value) {
            if (size == elements.length) {
                int[] newElements = new int[elements.length * 2];
                System.arraycopy(elements, 0, newElements, 0, elements.length);
                elements = newElements;
            }
            elements[size++] = value;
        }
        
        int get(int index) {
            return elements[index];
        }
        
        int size() {
            return size;
        }
    }

    static class Solution {
        public TreeNode balanceBST(TreeNode root) {
            IntList sortedValues = new IntList();
            inOrderTraversal(root, sortedValues);
            return buildBalancedBST(sortedValues, 0, sortedValues.size() - 1);
        }
        
        private void inOrderTraversal(TreeNode node, IntList list) {
            if (node == null) return;
            inOrderTraversal(node.left, list);
            list.add(node.val);
            inOrderTraversal(node.right, list);
        }
        
        private TreeNode buildBalancedBST(IntList values, int start, int end) {
            if (start > end) return null;
            int mid = start + (end - start) / 2;
            TreeNode node = new TreeNode(values.get(mid));
            node.left = buildBalancedBST(values, start, mid - 1);
            node.right = buildBalancedBST(values, mid + 1, end);
            return node;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        // Create an unbalanced BST
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        
        Solution solution = new Solution();
        TreeNode balancedRoot = solution.balanceBST(root);
        
        // Print the balanced tree (pre-order)
        System.out.println("Balanced BST (pre-order):");
        printPreOrder(balancedRoot);
    }
    
    private static void printPreOrder(TreeNode node) {
        if (node == null) {
            System.out.print("null ");
            return;
        }
        System.out.print(node.val + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }
}
