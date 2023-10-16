package Opps;

public class multi_level_inheritance {
    public static void main(String[] args) {
        dog dobby = new dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);
    }
}

class Animal {
    String color;
    
    void eat() {
        System.out.println("eat");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

class mammals extends Animal {
    int legs;
}

class dog extends mammals{
    int breed;
}
