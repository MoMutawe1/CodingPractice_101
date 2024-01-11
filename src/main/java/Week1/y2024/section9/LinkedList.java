package Week1.y2024.section9;

// Implement a Custom LinkedList
// https://leetcode.com/problems/reverse-linked-list-ii
public class LinkedList {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    static Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;

        while (current != null) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    // function used to reverse a linked list from position m to n

    // revstart and revend is start and end respectively of the
    // portion of the linked list which need to be reversed.

    // revstart_prev is previous of starting position and
    // revend_next is next of end of list to be reversed.

    Node reverseBetween(Node head, int m, int n)
    {
        if (m == n)
            return head;

        Node revstart = null, revstart_prev = null;
        Node revend = null, revend_next = null;

        int i = 1;
        Node current = head;
        while (current!=null && i <= n) {
            if (i < m)
                revstart_prev = current;
            if (i == m)
                revstart = current;
            if (i == n) {
                revend = current;
                revend_next = current.next;
            }
            current = current.next;
            i++;
        }
        revend.next = null;  // detach everything after reverseEnd Node.
        revend = reverse(revstart); // Reverse linked list starting with revs.

        if (revstart_prev!=null) // If starting position was not head
            revstart_prev.next = revend;
        else                     // If starting position was head
            head = revend;

        revstart.next = revend_next;  // attach 2 list of Nodes
        return head; // return the entire list of Nodes
    }

    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);
        list.head.next.next.next.next = new Node(50);
        list.head.next.next.next.next.next = new Node(60);
        list.head.next.next.next.next.next.next = new Node(70);
        list.reverseBetween(head,3,6);
        list.printList(head);
    }
}