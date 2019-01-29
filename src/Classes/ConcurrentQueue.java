package Classes;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentQueue {
    private Queue<Topic> queue;

    public ConcurrentQueue()
    {
        queue=new ConcurrentLinkedQueue<>();
    }
    public void insert(Topic elem) {
        queue.add(elem);
    }
    public Topic remove()
    {
        return queue.remove();
    }
    public int getSize()
    {
        return queue.size();
    }
}
