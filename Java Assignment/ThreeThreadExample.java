public class ThreeThreadExample {
    
    private static class GoodMorningThread extends Thread {
        public void run() {
            while (true) {
                System.out.println("Good Morning");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Good Morning thread interrupted");
                }
            }
        }
    }
    
    private static class HelloThread extends Thread {
        public void run() {
            while (true) {
                System.out.println("Hello");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Hello thread interrupted");
                }
            }
        }
    }
    
    private static class WelcomeThread extends Thread {
        public void run() {
            while (true) {
                System.out.println("Welcome");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    System.out.println("Welcome thread interrupted");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        GoodMorningThread t1 = new GoodMorningThread();
        HelloThread t2 = new HelloThread();
        WelcomeThread t3 = new WelcomeThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
