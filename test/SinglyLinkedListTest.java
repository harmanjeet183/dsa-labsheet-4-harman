package test;
import src.SinglyLinkedList;

public class SinglyLinkedListTest {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insert(1);
        list.insert(2);
        list.delete(1);
        System.out.print("[");
        list.traverse();
        System.out.print("]");
    }
}
