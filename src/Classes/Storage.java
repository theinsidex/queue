package Classes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Storage<K,V> {
    private volatile Map<K,V> store=new HashMap<>();
    public void add(K key,V value)
    {
        store.put(key,value);
    }
    public void show()
    {
        System.out.println(store);
    }
}
