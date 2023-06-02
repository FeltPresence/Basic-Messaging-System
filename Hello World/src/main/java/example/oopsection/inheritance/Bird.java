package example.oopsection.inheritance;

public class Bird extends Animal{

    private int wings;

    public Bird(String name, String color, int legs, boolean hasTale, int wings) {
        super(name, color, legs, hasTale);
        this.wings = wings;
    }

    @Override
    public void eat(String food) {
        super.eat(food);
        System.out.println("Chewing" + food);
    }

    public int getWings() {
        return wings;
    }

    public void fly () {
        System.out.println(this.getName() + " is flying");
    }

    public void fly(int speed){

    }
    public void setWings(int wings) {
        this.wings = wings;
    }
}
