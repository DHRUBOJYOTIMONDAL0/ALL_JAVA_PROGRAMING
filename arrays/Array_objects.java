// class Student{
//     int rollno;
//     String name;
//     int marks;
// }

// public class Array_objects {
//     public static void main(String[] args) {
//         Student s1 = new student();
//         s1.name = "Dhrubo";
//         s1.marks = 90;

//         Studetn s2 = new student();
//         s2.name = "sayan";
//         s2.marks = 91;
// s
//         Student s3 = new student();
//         s3.name = "Ankur";
//         s3.marks = 92;

//         Student students[] = new Student[3];
//         for (int i=0; i<students.length;i++){
//             System.out.println(students.name + " : " + students.marks);
//         }

//     }

// }

class Student {
    int rollno;
    String name;
    int marks;
}

public class Array_objects {
    public static void main(String[] args) {
        // Creating and initializing student objects
        Student s1 = new Student();
        s1.name = "Dhrubo";
        s1.marks = 90;

        Student s2 = new Student();
        s2.name = "Sayan";
        s2.marks = 91;

        Student s3 = new Student();
        s3.name = "Ankur";
        s3.marks = 92;

        // Storing student objects in an array
        // Student[] students = {s1, s2, s3};
        Student[] students = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // Printing student details
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " : " + students[i].marks);
        }
    }
}
