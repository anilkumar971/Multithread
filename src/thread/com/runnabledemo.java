package thread.com;

public class runnabledemo implements  Runnable {
    @Override
    public void run() {
        System.out.println("iam runnable"+Thread.currentThread().getName());
    }
}
