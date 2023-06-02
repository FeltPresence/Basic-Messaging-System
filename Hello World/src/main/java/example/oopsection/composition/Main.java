package example.oopsection.composition;

public class Main {
    public static void main(String[] args) {

        Car mercedes = new Car("Mercedes AMG", 2, "silver", new Engine("Renault", 8000));
        System.out.println(mercedes.getName());
        System.out.println("Engine Model: " + mercedes.getEngine().getModel());

    }
}

