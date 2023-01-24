package com.bootcoing.dsa.linkedList;

public class MiddleOfLIst {
    public static void main(String[] args) {
        Node head = createLinkedList();
        printLinkedList(head);
    }
    public static Node createLinkedList ()
    {
        Node firstNode = new Node(10);
        Node secondNode = new Node(20);
        Node thirdNode = new Node(30);
        Node forthNode = new Node(40);

        Node head = firstNode;
        head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = forthNode;
        forthNode.next = null;
        return head;
    }
    public static void printLinkedList (Node head)
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        Node ptr1 = temp.next;
        Node ptr2 = temp.next;

        while (ptr1.next != null) {


            ptr1 = ptr1.next;
            if(ptr1.next !=null) {
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            }
        }

        System.out.println("\nMiddle Element: " + ptr2.data);

    }
}


