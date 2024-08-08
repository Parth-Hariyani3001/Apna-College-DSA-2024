
public class Abstraction {

    public static void main(String args[]) {
        Car c1 = new Ferrari();
        c1.accelerate();
    }
}

abstract class Car {

    void accelerate() {
        System.out.println("Car goes forward");
    }

    abstract void brake();
}

class Ferrari extends Car {

    void brake() {
        System.out.print("Car stops");
    }
}
