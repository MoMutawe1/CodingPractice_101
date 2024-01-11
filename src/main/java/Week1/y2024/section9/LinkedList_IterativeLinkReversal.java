package Week1.y2024.section9;

// https://leetcode.com/problems/reverse-linked-list-ii
public class LinkedList_IterativeLinkReversal {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    // 10, 44, 16, 50, 3, 31
    public Node reverseBetween(Node head, int m, int n) {

        // Empty list
        if (head == null) {
            return null;
        }

        // Move the two pointers until they reach the proper starting point
        // in the list.
        Node current = head;
        Node prev = null;
        while (m > 1) {
            prev = current;
            current = current.next;
            m--;
            n--;
        }

        // The two pointers that will fix the final connections.
        Node connect = prev;
        Node tail = current;

        // Iteratively reverse the nodes until n becomes 0.
        Node nextNode = null;
        while (n > 0) {
            nextNode = current.next;
            current.next = prev; // detached nodes 10 <- 44 <- 16 <- 50 <- 3  ( 31 will stay alone for now with "current" & "nextNode" point to it )
            prev = current;
            current = nextNode;
            n--;
        }

        // Adjust the final connections as explained in the algorithm
        if (connect != null) {
            connect.next = prev; // this will make Node2 in our example point to Node5 which will flip the entire list
        } else {
            head = prev;
        }

        tail.next = current; // here will connect the last node again to the list
        return head;
    }

    void printLinkedList(LinkedList_IterativeLinkReversal.Node head){

        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        LinkedList_IterativeLinkReversal nodesList = new LinkedList_IterativeLinkReversal();
        head = new LinkedList_IterativeLinkReversal.Node(10);
        head.next = new LinkedList_IterativeLinkReversal.Node(44);
        head.next.next = new LinkedList_IterativeLinkReversal.Node(16);
        head.next.next.next = new LinkedList_IterativeLinkReversal.Node(50);
        head.next.next.next.next = new LinkedList_IterativeLinkReversal.Node(3);
        head.next.next.next.next.next = new LinkedList_IterativeLinkReversal.Node(31);

        System.out.println("LinkedList before reverse: ");
        nodesList.printLinkedList(head);
        System.out.println();
        System.out.println("Linked list after reversing the elements: ");
        head = nodesList.reverseBetween(head, 2, 5);
        nodesList.printLinkedList(head);
    }
}
