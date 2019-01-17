package Classes;

import java.util.*;

public class Topic<K,V> {
    private Map<K,V> table= new LinkedHashMap<K,V>();
    public synchronized void write(K k,V v)
    {
        table.put(k,v);
    }
    public synchronized void read(K k)
    {
        table.get(k);
    }
}
