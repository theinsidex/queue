package Classes;

public class Publisher implements Runnable {
    private String name;
    private Thread t;
    Publisher(String threadName)
    {
        name=threadName;
        t=new Thread(this,name);
        t.start();
    }
    @Override
    public void run() {

    }
}
