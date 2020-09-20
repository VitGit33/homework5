package ai.skillo.task5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapCreateUsersFB {
    public static void main(String[] args) {

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("http://www.facebook.com/Usain Bolt", "Usain Bolt");
        stringMap.put("http://www.facebook.com/Dean Karnazes", "Dean Karnazes");
        stringMap.put("http://www.facebook.com/Meb Keflezighi", "Meb Keflezighi");
        stringMap.put("http://www.facebook.com/Eliud Kipchoge", "Eliud Kipchoge");
        stringMap.put("http://www.facebook.com/Kenenisa Bekele", "Kenenisa Bekele");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter facebook link");
        String link = scanner.nextLine();
        System.out.println("Enter facebook name");
        String name = scanner.nextLine();

        if (stringMap.containsKey(link) && stringMap.containsValue(name)) {
            System.out.println("User with that name already include");
        }
        else if (!stringMap.containsKey(link) && !stringMap.containsValue(name)){
            stringMap.put(link, name);
            System.out.println(stringMap);

        }else {
            System.out.println("Incorrect link or name");
        }

    }

}
