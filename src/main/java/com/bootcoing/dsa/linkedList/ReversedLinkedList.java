package com.bootcoing.dsa.linkedList;
import static com.bootcoing.dsa.linkedList.SinlgyLinkedList.createLinkedList;
public class ReversedLinkedList {
    public static void main(String[] args) {
        Node head = createLinkedList();
        printLinkedList(head);
        Node node = reverse(head);
        printLinkedList(node);
    }

    private static Node reverse(Node head) {

        Node current = head;
        Node next = null;
        Node prev = null;

        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    private static void printLinkedList(Node head) {
        Node temp = head;
        System.out.println();
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }
}
