package thread.com;

public class lam {
    public static void main(String[] args) throws InterruptedException {
        Runnable r1=()->{
            for(int i=0;i<10;i++)
            {
                System.out.println("lam"+Thread.currentThread().getName());
            }
        };
        Runnable r2=()->{
            for(int i=0;i<20;i++)
            {
                System.out.println("ann"+Thread.currentThread().getName());
            }
        };
        Thread t2=new Thread(r1, "first");

        Thread t3=new Thread(r2,"sec");
       // System.out.println(t2.getState());
        t2.start();
       // System.out.println(t2.getState());
       // t2.join();
      // t2.sleep(1000);
        t3.start();
       // System.out.println(t2.getState());

    }
}
