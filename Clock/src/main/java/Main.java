import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        MyClock myClock = new MyClock();
        myClock.start();
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myClock.interrupt();
    }
}
