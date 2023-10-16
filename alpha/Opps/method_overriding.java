package Opps;

public class method_overriding {
    public static void main(String[] args) {
        deer d=new deer();
        d.eat();
    }
}

class Animal{
    void eat(){
        System.out.println("Eat anything");
    }
}

class deer extends Animal{
    void eat(){
        System.out.println("Eat paner only");
    }
}