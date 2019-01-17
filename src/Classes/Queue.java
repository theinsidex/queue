package Classes;

import java.util.LinkedList;
import java.util.List;

public class Queue {

    private List<Topic> queue=new LinkedList<>() ;


    public void insert(Topic elem) {
        queue.add(elem);
    }
    public Topic remove()
    {
        return queue.remove(queue.size()-1);
    }
    public int getSize()
    {
    return queue.size();
    }
}
