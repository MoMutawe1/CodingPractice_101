package Week1.y2024.section8;

import java.util.LinkedList;

public class ReverseLinkedList1 {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("foo");
        linkedList.add("boo");
        linkedList.add("moo");
        System.out.println("Elements before reversing: " + linkedList);
        System.out.println("Elements after reversing: " + reverseLinkedList(linkedList));
    }

    // Time Complexity: O(n) Space Complexity: O(n)
    private static LinkedList<String> reverseLinkedList(LinkedList<String> linkedList) {

        LinkedList<String> reversedLinkedList = new LinkedList<>();

        for(int i=linkedList.size()-1; i>=0; i--)
            reversedLinkedList.add(linkedList.get(i));

        return reversedLinkedList;
    }
}
