package example.oopsection.Challenge;

public class Skin  extends Organ {
    private String color;
    private int softness;

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Skin color " + this.getColor());
    }

    public String getColor() {
        return color;
    }

    public Skin(String name, String medicalCondition, String color, int softness) {
        super(name, medicalCondition);
        this.color = color;
        this.softness = softness;
    }
}
