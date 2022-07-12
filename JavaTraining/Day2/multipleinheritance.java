package JavaTraining.Day2;

class A {
    void multiplication(int a, int b) {
        int r1 = a * b;
        System.out.println("Multiplication is : " + r1);
    }
}

class B extends A {
    void multiplication(int a, int b) {
        super.multiplication(a, b);
        int sum = a + b;
        System.out.println("Addition is : " + sum);
    }
}

class rectangle {
    rectangle(int l, int b) {
        int ar = l * b;
        System.out.println("Area of rectangle : " + ar);
    }
}

class circle extends rectangle {
    circle(int r) {
        super(10, 2);
        double ar = 3.14 * r * r;
        System.out.println("Area of Circle : " + ar);
    }
}

public class multipleinheritance {
    public static void main(String... args) {
        A u = new A();
        u.multiplication(4, 6);
        B t = new B();
        t.multiplication(12, 5);
        circle C = new circle(5);
    }
}