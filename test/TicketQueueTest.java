package test;
import src.TicketQueue;

public class TicketQueueTest {
    public static void main(String[] args) {
        TicketQueue queue = new TicketQueue();
        queue.enqueue("ticket1");
        queue.enqueue("ticket2");
        System.out.println(queue.dequeue());
    }
}