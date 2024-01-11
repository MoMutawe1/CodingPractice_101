package Week1.y2024.section9;

// https://leetcode.com/problems/reverse-linked-list-ii
public class LinkedList_Recursion {

    static Node head;

    // Object level variables since we need the changes
    // to persist across recursive calls and Java is pass by value.
    private boolean stop;
    private Node left;

    static class Node {

        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    // 10, 44, 16, 50, 3, 31
    public void recurseAndReverse(Node right, int m, int n) {

        if (n == 1) {
            return;
        }

        // Keep moving the right pointer one step forward until (n == 1)
        right = right.next;

        // Keep moving left pointer to the right until we reach the proper node
        // from where the reversal is to start.
        if (m > 1) {
            this.left = this.left.next;
        }

        // Recurse with m and n reduced.
        this.recurseAndReverse(right, m - 1, n - 1);

        // In case both the pointers cross each other or become equal, we
        // stop i.e. don't swap data any further. We are done reversing at this
        // point.
        if (this.left == right || right.next == this.left) {
            this.stop = true;
        }

        // Until the boolean stop is false, swap data between the two pointers
        if (!this.stop) {
            int t = this.left.data;
            this.left.data = right.data;
            right.data = t;

            // Move left one step to the right.
            // The right pointer moves one step back via backtracking.
            this.left = this.left.next;
        }
    }

    public Node reverseBetween(Node head, int m, int n) {
        this.left = head;
        this.stop = false;
        this.recurseAndReverse(head, m, n);
        return head;
    }

    void printLinkedList(Node head){

        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        LinkedList_Recursion nodesList = new LinkedList_Recursion();
        head = new Node(10);
        head.next = new Node (44);
        head.next.next = new Node(16);
        head.next.next.next = new Node(50);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = new Node(31);

        System.out.println("LinkedList before reverse: ");
        nodesList.printLinkedList(head);
        System.out.println();
        System.out.println("Linked list after reversing the elements: ");
        head = nodesList.reverseBetween(head, 2, 5);
        nodesList.printLinkedList(head);
    }
}
