package src;
public class DoublyLinkedList {
    class Node {
        int data;
        Node prev, next;

        Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    Node head = null;

    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
            newNode.prev = current;
        }
    }

    public void delete(int data) {
        if (head == null) return;
        if (head.data == data) {
            head = head.next;
            if (head != null) head.prev = null;
            return;
        }
        Node current = head;
        while (current != null && current.data != data) {
            current = current.next;
        }
        if (current != null) {
            if (current.next != null) current.next.prev = current.prev;
            if (current.prev != null) current.prev.next = current.next;
        }
    }

    public void traverse() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
    }
}
