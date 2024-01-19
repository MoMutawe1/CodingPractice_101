package Week1.y2024.section9.leetcode_linkedlist_cycle_easy;

// https://leetcode.com/problems/linked-list-cycle
public class LinkedListCycle_FloydsAlgo1 {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    // head: 10 -> 44 -> 16 -> 50 -> 3 (3 will point back to 16).
    public boolean hasCycle(Node head) {

        if (head == null) {
            return false;
        }

        // Initialize tortoise and hare pointers
        Node tortoise = head;
        Node hare = head.next;

        while (tortoise != hare) { // Check if the hare meets the tortoise
            if (hare == null || hare.next == null) { // Check if there is no cycle
                return false;
            }

            // Move both pointers one step until they meet again
            tortoise = tortoise.next;
            hare = hare.next.next;
        }
        return true;
    }

    void printLinkedList(Node head){

        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        LinkedListCycle_FloydsAlgo1 nodesList = new LinkedListCycle_FloydsAlgo1();
        head = new LinkedListCycle_FloydsAlgo1.Node(10);
        head.next = new LinkedListCycle_FloydsAlgo1.Node(44);
        head.next.next = new LinkedListCycle_FloydsAlgo1.Node(16);
        head.next.next.next = new LinkedListCycle_FloydsAlgo1.Node(50);
        head.next.next.next.next = new LinkedListCycle_FloydsAlgo1.Node(3);
        head.next.next.next.next.next = head.next.next;  // this will make a cycle - last node with value 3 will point to second node with value 16.

        /*System.out.println("Print LinkedList : ");
        nodesList.printLinkedList(head);   // will cause infinite loop.
        System.out.println();*/
        System.out.println("Does Linked list has a Cycle: ");
        System.out.println(nodesList.hasCycle(head));
    }
}

