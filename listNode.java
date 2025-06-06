public class Main {
    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Definition for binary tree node.
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

    static class Solution {
        public TreeNode sortedListToBST(ListNode head) {
            if (head == null) return null;
            if (head.next == null) return new TreeNode(head.val);
            
            ListNode mid = findMiddle(head);
            TreeNode root = new TreeNode(mid.val);
            
            root.left = sortedListToBST(head);
            root.right = sortedListToBST(mid.next);
            
            return root;
        }
        
        private ListNode findMiddle(ListNode head) {
            ListNode prev = null;
            ListNode slow = head;
            ListNode fast = head;
            
            while (fast != null && fast.next != null) {
                prev = slow;
                slow = slow.next;
                fast = fast.next.next;
            }
            
            if (prev != null) {
                prev.next = null; // Break the link to split the list into two halves
            }
            
            return slow;
        }
    }

    public static void main(String[] args) {
        // Create a sorted linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        Solution solution = new Solution();
        TreeNode root = solution.sortedListToBST(head);
        
        // Print the BST with null values
        System.out.println("Tree structure with null values:");
        printTree(root);
    }
    
    // Helper method to print the tree with null values
    private static void printTree(TreeNode root) {
        if (root == null) {
            System.out.print("null ");
            return;
        }
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
}
