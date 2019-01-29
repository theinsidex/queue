package Classes;

public class Publisher<K,V> extends Thread {
    private  K key;
    private  V value;
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
    public void show()
    {
        System.out.println("Publisher"+key+":"+value);
    }
    @Override
    public void run() {
        if(!Thread.currentThread().isInterrupted()) {
            topic.clear();
            topic.write(key, value);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
