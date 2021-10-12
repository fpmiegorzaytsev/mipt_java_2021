public class Desktop extends DesktopComputer{
    private String videoCard;

    @Override
    public String toString(){
        return (getMaker() + " " + getModel() + " with such characteristics : "+ getProcessor() + ", " +getRAM() + ", " + getHDD() + ", " + getVideoCard());
    }

    public Desktop(String maker, String model, String processor, String RAM, String HDD, String videoCard){
        super(maker, model, processor, RAM, HDD);
        this.setVideoCard(videoCard);
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }
}
