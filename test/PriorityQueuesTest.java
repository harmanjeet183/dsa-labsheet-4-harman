package test;
import src.PriorityQueues;

public class PriorityQueuesTest {
    public static void main(String[] args) {
        PriorityQueues pq = new PriorityQueues(10);
        pq.insert(3);
        pq.insert(1);
        pq.insert(2);
        System.out.println(pq.remove());
    }
}
