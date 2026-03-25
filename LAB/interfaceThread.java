class MyRunnable implements Runnable {

    String name;

    MyRunnable(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " is running: " + i);
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class interfaceThread {
    public static void main(String[] args) {

        
        MyRunnable r1 = new MyRunnable("Thread-1");
        MyRunnable r2 = new MyRunnable("Thread-2");

        
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        // Start threads (simultaneous execution)
        t1.start();
        t2.start();
    }
}