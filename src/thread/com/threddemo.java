package thread.com;

  public class threddemo extends Thread{
     @Override
     public void run()
    {
        for(int i=0;i<5;i++) {
            System.out.println("this is my run method");
        }
    }
}
