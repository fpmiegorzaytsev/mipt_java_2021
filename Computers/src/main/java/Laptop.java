import java.security.Key;

public class Laptop extends PortableComputer{
    public Laptop(String maker, String model, String processor, String RAM, String HDD, Display display, Keyboard keyboard){
        super(model, maker, processor, RAM, HDD, display, keyboard);
    }
}
