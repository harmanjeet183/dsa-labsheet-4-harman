package src;
import java.util.Queue;
import java.util.LinkedList;

public class TicketQueue {
    Queue<String> queue = new LinkedList<>();

    public void enqueue(String ticket) {
        queue.add(ticket);
    }

    public String dequeue() {
        return queue.poll();
    }
}