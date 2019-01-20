package Classes;

public class Publisher<K,V> implements Runnable {
    private volatile K key;
    private volatile V value;
    private Topic topic;
    public Publisher(Topic topic,K key,V value)
    {
        if(topic==null) throw new IllegalArgumentException("Topic is null!");
        else this.topic=topic;

        if(key==null) throw new IllegalArgumentException("Key is null!");
        else this.key=key;

        if(value==null) throw new IllegalArgumentException("Value is null!");
        else this.value=value;

    }
    @Override
    public void run() {
        topic.write(key,value);
    }
}
