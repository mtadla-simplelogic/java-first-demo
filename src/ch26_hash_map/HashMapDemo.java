package ch26_hash_map;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("Mateusz", 123);
        empIds.put("Carlos", 332);
        empIds.put("John", 332);
        empIds.put("Isabel", 32323);

        System.out.println(empIds);

        System.out.println("Zmieniam Carlosa");
        empIds.put("Carlos", 67123);

        System.out.println(empIds);

        System.out.println("Wartosc dla klucza 'Mateusz' to:");
        System.out.println(empIds.get("Mateusz"));



        for(String key : empIds.keySet()){
            System.out.println("Wartosc dla klucza: " + key + " to: " + empIds.get(key));
        }


    }
}
