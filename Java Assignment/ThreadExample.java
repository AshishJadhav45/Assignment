public class ThreadExample implements Runnable {
    private String threadName;
    
    public ThreadExample(String threadName) {
        this.threadName = threadName;
    }
    
    public void run() {
        System.out.println("Thread " + threadName + " started");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + threadName + " running " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread " + threadName + " interrupted");
            }
        }
        System.out.println("Thread " + threadName + " finished");
    }
    
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadExample("Thread 1"));
        Thread t2 = new Thread(new ThreadExample("Thread 2"));
        t1.start();
        t2.start();
    }
}
