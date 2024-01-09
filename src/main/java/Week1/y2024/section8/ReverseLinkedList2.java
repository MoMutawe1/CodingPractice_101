package Week1.y2024.section8;

import java.util.LinkedList;

public class ReverseLinkedList2 {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        System.out.println("Elements before reversing: " + linkedList);
        System.out.println("Elements after reversing: " + reverseLinkedList(linkedList));
    }

    // Time Complexity: O(n/2) Space Complexity: O(1)
    private static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> linkedList) {

        for (int i = 0; i < linkedList.size()/2; i++) {
            Integer temp = linkedList.get(i);
            linkedList.set(i, linkedList.get(linkedList.size() - i - 1));
            linkedList.set(linkedList.size() - i - 1, temp);
        }
        return linkedList;
    }
}
