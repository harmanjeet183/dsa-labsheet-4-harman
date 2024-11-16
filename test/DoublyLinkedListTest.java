package test;
import src.DoublyLinkedList;

public class DoublyLinkedListTest {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insert(1);
        list.insert(2);
        list.delete(2);
        System.out.print("[");
        list.traverse();
        System.out.print("]");
    }
}
