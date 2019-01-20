import Classes.Publisher;
import Classes.Queue;
import Classes.Topic;

public class Main {
    public static void main(String[] args) {
        Queue queue=new Queue();
        Topic t1=new Topic();
        Topic t2=new Topic();
        queue.insert(t1);
        queue.insert(t2);
        System.out.println(queue.getSize());
        Publisher thread1=new Publisher(t1,2,"Hello");
        t1.show();

    }
}
