package Classes;

public class Listener implements Runnable {
    private String name;
    private Thread t;
    public Listener(String threadName)
    {
        name=threadName;
        t=new Thread(this,name);
        t.start();
    }
    @Override
    public void run() {

    }
}
