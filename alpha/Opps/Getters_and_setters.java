package Opps;

public class Getters_and_setters {
    public static void main(String[] args) {
        pen p1 = new pen(); //created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());
        //p1.setColor("yellow");
        p1.setColor("yellow");
        System.out.println(p1.getColor());
    }
}

class pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
}
