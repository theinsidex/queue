package Classes;

import java.util.*;

public class Topic<K,V> {
   // private volatile Map<K,V> table= new HashMap<>();
    private volatile List<K> keys=new LinkedList<>();
    private volatile List<V> values=new LinkedList<>();
    public synchronized void write(K k,V v)
    {
        keys.add(k);
        values.add(v);
    }
    public void clear()
    {
        keys.clear();
        values.clear();
    }
    public synchronized HashMap<K, V> read()
    {
        HashMap<K,V> table=new HashMap<>();
        table.put(keys.get(0),values.get(0));
        return table;
    }
    public void show()
    {
        System.out.println("Topic"+keys+":"+values);

    }
}
