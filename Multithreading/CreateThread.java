public class CreateThread extends Thread
{
    public void run()
    {
        System.out.println("Thread is running...");
    }
    public static void main(String []args) throws InterruptedException
    {
        CreateThread ct = new CreateThread();
        Thread.sleep(100);
        System.out.println(ct.getState());
        ct.start();
        System.out.println(ct.getState());
    }
}