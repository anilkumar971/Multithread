package thread.com;

public class mainthread extends Thread {
    public static void main(String[] args) {
//       Thread t= Thread.currentThread();
//       t.setName("first");
//        System.out.println((t));
//
//        threddemo th=new threddemo();
//        Thread tf=new Thread(th);
//        tf.start();
//        threddemo th1=new threddemo();
//        Thread tf1=new Thread(th);
//        tf1.start();
        runnabledemo r1=new runnabledemo();
        Thread t1=new Thread(r1);

        t1.start();
        t1.setName("newt");
        System.out.println(t1);

        System.out.println(Thread.activeCount());



    }
}
