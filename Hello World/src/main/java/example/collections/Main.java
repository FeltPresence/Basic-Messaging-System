package example.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Tawonga");
        names.add("Kuziwa");

        System.out.println(names.get(0));
        System.out.println(names.size());

        Map<String, String> emailList = new HashMap<>();
        emailList.put("Tawonga", "profrakata@gmail.com");
        emailList.put("Kuziwa", "engrakata@gmail.com");

    }
}
