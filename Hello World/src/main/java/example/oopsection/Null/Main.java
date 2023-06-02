package example.oopsection.Null;

public class Main {
    public static void main(String[] args) {
        Car mercedes = null;
        if (mercedes!=null){
            mercedes.getName();
        } else{
            System.out.println("The car was null");
        }

    }
}
