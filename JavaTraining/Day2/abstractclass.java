package JavaTraining.Day2;

abstract class Area{//We cannot instantiate an abstract class i.e we cannot create an object of abstract class and it is always a base class for some other class.
    void AreaOfRectangle(int l, int w){
        int ar = l*w;
        System.out.println("Area of Rectangle : "+ar);
    }
    abstract void areaOfCircle(int r);
}

class areaCircle extends Area{
    void areaOfCircle(int r){
        double ar2 = 3.14*r*r;
        System.out.println("Area of Circle : "+ar2);
    }
}

public class abstractclass {
    public static void main(String[] args){
        areaCircle arc = new areaCircle();
        arc.AreaOfRectangle(2,5);
        arc.areaOfCircle(5);
    }
}