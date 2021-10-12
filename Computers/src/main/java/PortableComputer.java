public abstract class PortableComputer extends ComputerImpl {
    private Display display;
    private Keyboard keyboard;

    @Override
    public String toString(){
        return (getMaker() + " " + getModel() + " with such characteristics : "+ getProcessor() + ", " + getRAM() + ", " + getHDD() + "; " + getDisplay().toString() + "; " + getKeyboard().toString());
    }
    public PortableComputer(String maker, String model, String processor, String RAM, String HDD, Display display, Keyboard keyboard){
        super(maker, model,processor, RAM, HDD );
        this.setDisplay(display);
        this.setKeyboard(keyboard);
    }


    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
