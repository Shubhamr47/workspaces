package Opps;

public class constructor {
    public static void main(String[] args) {
        student s1 = new student("shubhamRajput");
        System.out.println(s1.name);
    }
}

class student{
    String name;
    int rollno;

    student(String name){
        this.name = name;
    }
}
