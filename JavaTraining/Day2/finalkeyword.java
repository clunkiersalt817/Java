/*package JavaTraining.Day2;

class Bike {
    final int speedlimit = 90; // final variable

    void run() {
        speedlimit = 400; // The final field Bike.speedlimit cannot be assigned
    }

    final void runner() {
        System.out.println("running");
    }
}

class Honda extends Bike {
    void runner() //Cannot override the final method from Bike
    {
        System.out.println("running safely with 100Kmph");
    }
}

public class finalkeyword {
    public static void main(String... args) {
        Bike obj = Bike();
        obj.run();
        Honda honda = new Honda();
        honda.runner();
    }
}// end of class
*/