import javax.swing.plaf.TableHeaderUI;

public class Main {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        Runner runner = new Runner();
        Thread thread2 = new Thread(runner);
        thread1.start();
        thread2.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println("This is extended thread");
    }
}
class Runner implements Runnable{
    @Override
    public void run(){
        System.out.println("This is runnable thread");
    }
}