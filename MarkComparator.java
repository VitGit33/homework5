package ai.skillo.task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MarkComparator {

    public static void main(String[] args) {
        Student students1 = new Student("Klara", 18, "E");
        Student students2 = new Student("Petia", 20, "C");
        Student students3 = new Student("Bob", 19, "B");
        Student students4 = new Student("Klara", 17, "A");
        Student students5 = new Student("Tamara", 18, "D");

        List<Student> list= new ArrayList<>();

        list.add(students1);
        list.add(students2);
        list.add(students3);
        list.add(students4);
        list.add(students5);


        Collections.sort(list);
        for (Student stud : list) {
            System.out.println(stud);

        }

    }

}
