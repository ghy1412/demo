package com.bit;

class Node {
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}
public class DeleteNode {
    public static Node deleteNode(Node head, int value) {
        //鲁班性
        if (head == null) {
            return head;
        }

        if (head.value == value) {
            Node tmp = head.next;
            head.next = null;
            head = tmp;
            return head;
        }
        Node tmpHead = head;
        Node nextP = head.next;
        while (nextP != null) {
            if (nextP.value == value) {
                tmpHead.next = nextP.next;
                break;
            }
            tmpHead = nextP;
            nextP = nextP.next;
        }
        return head;
    }
}
