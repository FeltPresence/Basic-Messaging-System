package example.ArraysPhoneNumDir;

import java.util.Scanner;

public class ArrayPhoneNumDir {
    public static void main(String[] args) {
        String[] names = { "Tadiwa", "Tanatswa", "Ba Mila", "Kuziwa", "Tatenda"};
        int[] numbers = {0000, 1111, 2222, 3333, 4444};
        for (int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("Please Enter a name: ");
        Scanner scanner = new Scanner(System.in);
        String name =scanner.next();
        for (int i =0; i<names.length; i++) {
            if (name.equals(names[i])){
                System.out.println(numbers[i]);
            }
        }
    }
}
