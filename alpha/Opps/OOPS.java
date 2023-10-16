package Opps;

public class OOPS {
    public static void main(String[] args) {
        pen p1 = new pen(); // created a pen object called p1
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("yellow");
        p1.color = "yellow";
        System.out.println(p1.color);
    }
}

class pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class Student {
    String name;
    int roll;
    float percentage;

    void calpercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}