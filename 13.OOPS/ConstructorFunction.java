
public class ConstructorFunction {

    public static void main(String[] args) {
        Student s1 = new Student("Parth Hariyani");
        Student s2 = new Student(37);
        Student s3 = new Student();
        System.out.println(s1.name);
        System.out.println(s2.roll);
        System.out.println(s3);

        //Copy Constructor
        Student s4 = new Student(s1);
        System.out.println(s4.name);
    }
}

class Student {

    String name;
    int roll;
    int marks[];

    //Copy Constructor
    //Shallow Copy Constructor
    // Student(Student stud) {
    //     this.name = stud.name;
    //     this.roll = stud.roll;
    //     this.marks = stud.marks
    // }
    //Deep Copy Constructor
    Student(Student stud) {
        this.name = stud.name;
        this.roll = stud.roll;
        marks = new int[3];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = stud.marks[i];
        }
    }

    Student(String name) {
        this.name = name;
    }

    Student(int roll) {
        this.roll = roll;
    }

    Student() {
        System.out.println("Student is Created");
    }
}
