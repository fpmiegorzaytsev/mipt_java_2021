public abstract class ComputerImpl implements Computer
{
    private String maker;
    private String model;
    private String processor;
    private String RAM;
    private String HDD;

    public ComputerImpl(String maker, String model, String processor, String RAM, String HDD){
        this.setMaker(maker);
        this.setModel(model);
        this.setProcessor(processor);
        this.setRAM(RAM);
        this.setHDD(HDD);
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public void setHDD(String HDD) {
        this.HDD = HDD;
    }
    @Override
    public String toString(){
        return (getMaker() + " " + getModel() + " with such characteristics : "+ getProcessor() + ", " +getRAM() + ", " + getHDD());
    }

    //так мы избавляемся от дублирующего кода
    //в дальнейшем, все что нам нужно - переопределить метод toString
    public String turnOn() {
        return "Turn on "+getClass().getSimpleName()+" "+toString();
    }

    public String turnOff() {
        return "Turn off "+getClass().getSimpleName()+" "+toString();
    }

    public String connect() {
        return "Connect to internet "+getClass().getSimpleName()+" "+toString();
    }



}
