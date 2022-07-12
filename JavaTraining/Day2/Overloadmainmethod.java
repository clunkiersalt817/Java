package JavaTraining.Day2;

public class Overloadmainmethod {
    public static void main() {
        System.out.println("No argument main called !");
    }

    public static void main(int a) {
        System.out.println("Value of a = " + a);
    }

    public static void main(int a, int b) {
        System.out.println("Value of a and b = " + a + " " + b + " Respectively !");
    }

    public static void main(String... args) {
        main();
        main(5);
        main(7, 6);
    }
}
