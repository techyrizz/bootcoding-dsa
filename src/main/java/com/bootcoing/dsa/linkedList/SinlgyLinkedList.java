package com.bootcoing.dsa.linkedList;
public class SinlgyLinkedList {
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
            int count = 0;
            while (temp != null) {
                count++;
                System.out.println(temp.data );
                temp = temp.next;

            }

        }
    }
