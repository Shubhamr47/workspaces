package Opps;

public class copy_constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "shubham";
        s1.roll = 456;
        s1.password = "yoyo";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 50;

        Student s2 = new Student(s1); //copy
        s2.password = "xyz";
        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}
class Student  {
    String name;
    int roll;
    String password;
    int marks[];

    //copy constructor
    Student(Student s1){
        //System.out.println("constructor is called.....");
        marks = new int [3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    Student(){
        marks = new int[3];
        System.out.println("constructor is colled.....");
    }
    Student(String name){
        marks = new int[3];
        this.name = name;
    }
    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }
}     





// package Opps;

// public class copy_constructor {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "shubham";
//         s1.roll = 456;
//         s1.setPassword("yoyo");
//         s1.marks[0] = 100;
//         s1.marks[1] = 90;
//         s1.marks[2] = 50;

//         Student s2 = new Student(s1); // copy
//         s2.setPassword("xyz");
//         s1.marks[2] = 100;

//         for (int i = 0; i < 3; i++) {
//             System.out.println(s2.marks[i]);
//         }
//     }
// }

// class Student {
//     private String name;
//     private int roll;
//     private String password;
//     private int[] marks;

//     // copy constructor
//     Student(Student s1) {
//         this.name = s1.name;
//         this.roll = s1.roll;
//         this.password = s1.password;

//         // Copying the marks array
//         this.marks = new int[s1.marks.length];
//         System.arraycopy(s1.marks, 0, this.marks, 0, s1.marks.length);
//     }

//     Student() {
//         marks = new int[3];
//         System.out.println("constructor is called...");
//     }

//     Student(String name) {
//         marks = new int[3];
//         this.name = name;
//     }

//     Student(int roll) {
//         marks = new int[3];
//         this.roll = roll;
//     }

//     public void setPassword(String password) {
//         this.password = password;
//     }
// }
