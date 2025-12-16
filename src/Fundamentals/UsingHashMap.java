package Fundamentals;

import java.util.HashMap;

public class UsingHashMap {

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        HashMap<Integer,Double> map2 = new HashMap<>();

        map.put("one", "uno");

        map2.put(1, 2.5);
        map2.put(2, 5.2);

        System.out.println(map.get("one"));
        System.out.println(map2.get(1));
        System.out.println(map2.get(2));
    }
}
