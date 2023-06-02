package example.oopsection.Challenge;

public class Eye extends Organ {

    private String color;
    private boolean isOpened;

    public String getColor() {
        return color;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("color" + this.getColor());

    }

    public void open() {
        this.setOpened(true);
        System.out.println(this.getName() + " Opened");
    }

    public void close() {
        this.setOpened(false);
        System.out.println(this.getName() + " Closed");
    }

    public Eye(String name, String medicalCondition, String color, Boolean isOpened) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpened = isOpened;
    }
}
