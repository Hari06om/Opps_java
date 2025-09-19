
public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Hari Om Verma", 5);
        Student s2 = new Student("Anjali Sharma", 10);

        printStudentInfo(s1);
        printStudentInfo(s2);
    }

    private static void printStudentInfo(Student student) {
        System.out.println("Name: " + student.getName());
        System.out.println("Roll: " + student.getRoll());
        System.out.println("----------------------");
    }
}

class Student {
    private String name;
    private int roll;

    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }
}
