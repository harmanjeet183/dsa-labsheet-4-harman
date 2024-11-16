package src;
public class PriorityQueues {
    private int[] heap;
    private int size;
    private int capacity;

    public PriorityQueues(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity + 1]; // Index 0 is unused
    }

    private int parent(int i) { return i / 2; }
    private int leftChild(int i) { return 2 * i; }
    private int rightChild(int i) { return 2 * i + 1; }

    public void insert(int data) {
        if (size >= capacity) {
            throw new IllegalStateException("Heap is full");
        }
        size++;
        heap[size] = data;
        int current = size;

        while (current > 1 && heap[current] < heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int remove() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int min = heap[1];
        heap[1] = heap[size];
        size--;
        heapify(1);
        return min;
    }

    private void heapify(int i) {
        int smallest = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left <= size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right <= size && heap[right] < heap[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int peekMin() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap[1];
    }
}