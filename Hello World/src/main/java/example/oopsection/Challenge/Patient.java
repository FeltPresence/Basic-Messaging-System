package example.oopsection.Challenge;

public class Patient {
    private String name;
    private int age;
    private Eye LeftEye;
    private Eye RightEye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;

    public Patient(String name, int age, Eye leftEye, Eye rightEye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        LeftEye = leftEye;
        RightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Eye getLeftEye() {
        return LeftEye;
    }

    public Eye getRightEye() {
        return RightEye;
    }

    public Heart getHeart() {
        return heart;
    }

    public Stomach getStomach() {
        return stomach;
    }

    public void setStomach(Stomach stomach) {
        this.stomach = stomach;
    }

    public Skin getSkin() {
        return skin;
    }
}
