import java.util.Timer;
import java.util.TimerTask;

public class MyClock extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Tik");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Tak");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Oh no! Thread 'main' is already awake! He killed the MyClock thread!");
                break;
            }
        }
    }
}
