package Classes;

import java.util.HashMap;
import java.util.Map;

public class Listener<K,V> extends Thread {
    private Topic topic;
    private Storage storage;

    public Listener(Topic topic,Storage storage) {
        if (topic == null) throw new IllegalArgumentException("Topic is null!");
        else this.topic = topic;
        if(storage==null) throw new IllegalArgumentException("Storage is null!");
        else this.storage=storage;
    }

    @Override
    public void run() {
        if (!Thread.currentThread().isInterrupted()) {
            HashMap<K, V> map = new HashMap<>();
            map = topic.read();
            for (Map.Entry<K, V> it : map.entrySet()) {
                //table.put(it.getKey(), it.getValue());
                storage.add(it.getKey(),it.getValue()
                );
            }
        }
    }
}
