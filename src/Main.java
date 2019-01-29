import Classes.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
    ConcurrentQueue queue=new ConcurrentQueue();
    Topic topic=new Topic();
    queue.insert(topic);
    Publisher publisher=new Publisher(topic,4,"Hello");
    Publisher publisher1=new Publisher(topic, 2,"Double");
    publisher.start();
    publisher.join();
    Storage storage=new Storage();
    Listener listener=new Listener(topic,storage);
    Listener listener1=new Listener(topic,storage);
    listener.start();
    listener.join();
        publisher1.start();
        publisher1.join();
        publisher1.show();
     listener1.start();
    topic.show();
    publisher.show();
    storage.show();

    }
}
