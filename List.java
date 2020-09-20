package ai.skillo.task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class List {
    public static void main(String[] args) {

        LinkedList<Integer> elements = new LinkedList<>();

        elements.add(3);
        elements.addLast(4);
        elements.addFirst(2);
        elements.addLast(5);
        elements.addFirst(1);
        System.out.println(elements);
        System.out.println();

        elements.removeLast();
        elements.removeFirst();
        elements.removeLast();
        elements.removeFirst();
        System.out.println(elements);
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        String action = "";
        for (int i = 0; i < 10; i++) {
            elements.add(i);
        }
        while (!action.equals("0")) {
            System.out.println("0 - exit");
            System.out.println("1 - get brick");
            System.out.println("2 - show tower");
            action = scanner.nextLine();

            if (action.equals("1")) {
                elements.addLast(elements.remove(randomInt(1, 10)));
            } else if (action.equals("2")) {
                for (int brick : elements) {
                    System.out.print(brick + " ");
                }
                System.out.println();
            }
        }
    }
    private static int randomInt(int min, int max) {
        Random rand = new Random();
        return min + rand.nextInt(max - min);
    }
}
