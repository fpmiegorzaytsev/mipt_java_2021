public class Keyboard {
    private String type;
    private String languages;

    public Keyboard(String type, String languages) {
        this.setType(type);
        this.setLanguages(languages);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguages() {
        return languages;
    }

    public void setLanguages(String languages) {
        this.languages = languages;
    }
    @Override
    public String toString(){
        return("Keyboard parameters : " + "Type :" +getType() + ", " + "Languages :"  + getLanguages());
    }
}
