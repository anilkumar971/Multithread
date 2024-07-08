package thread.com;

public class taskbrick {
   //volatile int brickcount=0;
     int brickcount=0;
    public  synchronized void incrementbriccount()
    {
//        synchronized (this){
//            brickcount+=50;
//        }
        brickcount+=50;
    }
}
