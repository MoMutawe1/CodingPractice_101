package Week1.y2024.section8;

// Implement a Custom LinkedList
// https://leetcode.com/problems/reverse-linked-list/
public class LinkedList {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    // Reverse linked list
    /*
        NULL                           1 -> 2 -> 3 -> 4 -> 5 -> NULL
        1 -> NULL                      2 -> 3 -> 4 -> 5 -> NULL
        2 -> 1 -> NULL 		           3 -> 4 -> 5 -> NULL
        3 -> 2 -> 1 -> NULL            4 -> 5 -> NULL
        4 -> 3 -> 2 -> 1 -> NULL       5 -> NULL
        5 -> 4 -> 3 -> 2 -> 1 -> NULL  NULL
     */
    Node reverse(Node node)
    {
        Node prevNode = null;
        Node current = node;
        Node nextNode = null;
        while (current != null) {
            nextNode = current.next;
            current.next = prevNode;
            prevNode = current;
            current = nextNode;
        }
        node = prevNode;
        return node;
    }

    // prints content of double linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}
