package Opps;

public class type_constructor {
    public static void main(String[] args) {

        student s3 = new student(null);         
        student s1 = new student("shubhamRajput");
        System.out.println(s1.name);

        student s2 = new student(55);
        System.out.println(s2.rollno);
    }
}
class student{
    String name;
    int rollno;

    student(){
        System.out.println("constructor is colled......");
    }
    student(int rollno){
        this.rollno = rollno;
    }
    student(String name){
        this.name = name;
    }
}