import java.security.Key;

public class Main {
    public static void main(String[] args ){
        ComputerImpl computer[] = new ComputerImpl[6];
        computer[0] = new Laptop("MSI", "BM14W", "Ryzen 5", "16 gb", "512 gb", new Display("15.6 inches", "TN"), new Keyboard("Membrane", "Russian, English, Dutch"));
        computer[1] = new Netbook("Prestigio", "Smart book 133 C4 grey", "AMD A4", "4 gb", "64 gb", new Display("14 inches", "IPS"), new Keyboard("Membrane", "Russian, English"));
        computer[2] = new Desktop("Digital Razor", "Pro-gaming","Intel core i5", "32 gb", "1 Tb", "NVIDIA GeForce GTX 2060 6GB");
        computer[3] = new Monoblock("Lenovo", "IdeaCentre A540-24ICB", "Intel Core i3", "8gb", "1Tb", new Display("23.8","IPS"));
        computer[4] = new Server("Dell", "Power edge", "Intel Xeon", "8gb", "1 Tb");
        computer[5] = new Nettop("ASUS", "PN62-BB7005MD", "Intel Core i7", "16 gb", "512 gb");
        for(int i = 0; i < 6; i++){
            System.out.println(computer[i].turnOn());
            System.out.println(computer[i].connect());
            System.out.println(computer[i].turnOff());
            System.out.println();
        }
    }
}
