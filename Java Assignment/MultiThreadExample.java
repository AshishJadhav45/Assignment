public class MultiThreadExample extends Thread {
    private String threadName;
    
    public MultiThreadExample(String threadName) {
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
        MultiThreadExample t1 = new MultiThreadExample("Thread 1");
        MultiThreadExample t2 = new MultiThreadExample("Thread 2");
        MultiThreadExample t3 = new MultiThreadExample("Thread 3");
        t1.start();
        t2.start();
        t3.start();
    }
}
