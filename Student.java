package ai.skillo.task5;

public class Student implements Comparable<Student> {

    private String name;
    private Integer age;
    private String grade;

    public Student(String name, Integer age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }


    @Override
    public int compareTo(Student o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.age.compareTo(o.age);

        }
        return result;

    }

    @Override
    public String toString() {
        return "SortingStudents{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }

}
