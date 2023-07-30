import java.util.Queue;

interface QueueBehaviour {
    boolean enqueue(String person);
    String dequeue();
    int queueSize();
    void clearQueue();
}