package Week1.y2024.section9.leetcode_linkedlist_cycle_medium;

public class LinkedListCycle_FloydsAlgo2 {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static Node hasCycle(Node head) {

        if(head.next == null) return null;

        Node tortoies = head;
        Node hare = head.next;

        while (hare != null){
            if(tortoies == hare) return tortoies;
            hare = hare.next.next;
            tortoies = tortoies.next;
        }
        return null;
    }

    /*    void printLinkedList(Node head){

        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }*/

    public static void main(String[] args) {
        head = new Node(10);
        head.next = new Node(44);
        head.next.next = new Node(16);
        head.next.next.next = new Node(50);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = head.next.next;  // this will make a cycle - last node with value 3 will point to second node with value 16.

        /*System.out.println("Print LinkedList : ");
        nodesList.printLinkedList(head);   // will cause infinite loop.
        System.out.println();*/
        System.out.println("Does Linked list has a Cycle? Where? ");
        head = hasCycle(head);
        System.out.println(head.data);
    }
}
