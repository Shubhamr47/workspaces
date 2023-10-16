// package Opps;

// public class hierarchial_inheritance {
//     public static void main(String[] args) {
//         mammals man = new mammals();
//         man.eat();
//         man.breathe();
//     }
// }

// class animal{
//     String color;

//     void eat(){
//         System.out.println("eat");
//     }

//     void breathe(){
//         System.out.println("breathe");
//     }
// }

// class fish extends animal{
//     int swim;
// }

// class mammals extends animal{
//     int walk;
// }


// class bird extends animal{
//     int fly;
// }


package Opps;

public class hierarchial_inheritance {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.eat();
        sparrow.breathe();
        //sparrow.fly();
        sparrow.chirp();
    }
}

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void breathe() {
        System.out.println("Animal is breathing");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Bird is flying");
    }
}

class Sparrow extends Animal {
    void chirp() {
        System.out.println("Sparrow is chirping");
    }
}