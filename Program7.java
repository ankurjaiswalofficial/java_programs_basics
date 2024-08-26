import java.lang.*;

class Program7 extends Thread {
    static {
        Thread t = Thread.currentThread();
        // Thread t=new Thread.currentThread(); System.out.println("threadtest isloaded
        // by"+t.getName()+"thread");
        t.setName("johnDoe");
        System.out.println("changed the name of thread");
        System.out.println("suspending thread for 5 sec");
        try {
            Thread.sleep(5000);
        } catch (Exception ex) {
        }
    }

    public static void main(String[] arr) {
        Thread t = Thread.currentThread();
        System.out.println("main() is invoked in" + t.getName() + "thread...");
    }
}
