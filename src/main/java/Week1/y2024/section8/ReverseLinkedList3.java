package Week1.y2024.section8;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList3 {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println("Elements before reversing: " + linkedList);

        // Time Complexity: O(n/2) Space Complexity: O(1)
        Collections.reverse(linkedList);
        System.out.println("Elements after reversing: " + linkedList);
    }
}
