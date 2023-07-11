public class ThreadPriorityExample {
    
    private static class LowPriorityThread extends Thread {
        public void run() {
            while (true) {
                System.out.println("Low priority thread is running");
            }
        }
    }
    
    private static class MediumPriorityThread extends Thread {
        public void run() {
            while (true) {
                System.out.println("Medium priority thread is running");
            }
        }
    }
    
    private static class HighPriorityThread extends Thread {
        public void run() {
            while (true) {
                System.out.println("High priority thread is running");
            }
        }
    }
    
    public static void main(String[] args) {
        LowPriorityThread t1 = new LowPriorityThread();
        MediumPriorityThread t2 = new MediumPriorityThread();
        HighPriorityThread t3 = new HighPriorityThread();
        
        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        
        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}
