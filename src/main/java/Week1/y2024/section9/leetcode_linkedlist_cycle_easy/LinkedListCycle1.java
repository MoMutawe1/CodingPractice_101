package Week1.y2024.section9.leetcode_linkedlist_cycle_easy;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/linked-list-cycle
public class LinkedListCycle1 {

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
        Set<Node> trackNodes = new HashSet<>();
        while (head != null){
            if(trackNodes.contains(head)) return true;
            trackNodes.add(head);
            head = head.next;
        }
        return false;
    }

    /*    void printLinkedList(Node head){

            while(head!=null){
                System.out.print(head.data + " ");
                head = head.next;
            }
        }*/

    public static void main(String[] args) {
        LinkedListCycle1 nodesList = new LinkedListCycle1();
        head = new Node(10);
        head.next = new Node(44);
        head.next.next = new Node(16);
        head.next.next.next = new Node(50);
        head.next.next.next.next = new Node(3);
        head.next.next.next.next.next = head.next.next;  // this will make a cycle - last node with value 3 will point to second node with value 16.

        /*System.out.println("Print LinkedList : ");
        nodesList.printLinkedList(head);   // will cause infinite loop.
        System.out.println();*/
        System.out.println("Does Linked list has a Cycle: ");
        System.out.println(nodesList.hasCycle(head));
    }
}
