public class Monoblock extends DesktopComputer{
    private Display display;
    public Monoblock(String maker, String model, String processor, String RAM, String HDD, Display display){
        super(maker, model, processor, RAM, HDD);
        this.setDisplay(display);
    }
    @Override
    public String toString(){
        return (getMaker() + " " + getModel() + " with such characteristics : "+ getProcessor() + ", " + getRAM() + ", " + getHDD() + "; " + getDisplay().toString());
    }
    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }
}
