package example.Phone;

public class Main {
    public static void main(String[] args) {
        Phone Redmi = new Phone("Redmi Pro 11", 5, 128, 64);
        System.out.println(Redmi.getName());

        Phone Xiaomi = new Phone("Xiaomi 12",164);
        System.out.println(Xiaomi.getName());
        Redmi.playMusic("Fire Emoji");
        Redmi.playMusic("Ndaremerwa");

    }
}
