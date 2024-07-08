package thread.com;
//racecondition
public class task {
    public static void main(String[] args)throws Exception{

taskbrick bd=new taskbrick();

        Runnable r1=()->{

        for(int i=0;i<10000;i+=50)
        {
         bd.incrementbriccount();
        }
    };
        Runnable r2=()->{

            for(int i=0;i<15000;i+=50)
            {
                bd.incrementbriccount();
            }
        };
        Runnable r3=()->{

            for(int i=0;i<500;i+=50)
            {
                bd.incrementbriccount();
            }
        };
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        Thread t3=new Thread(r3);
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        System.out.println(bd.brickcount);
    }

}
//racecondition