package abstraction;

abstract class Car {
    int maxSpeed;

    abstract void accelerate();

    abstract void brake();
}

abstract class A {
    int X = 10;

    void fun() {
        System.out.println("Hello, I'm A");
    }
}

abstract class BMW extends Car {
    void accelerate() {
        System.out.println("BMW is accelerating");
    }
}

class BMW2 extends BMW {
    void brake() {
        System.out.println("BMW is braking");
    }
}

public class AbstractStudy {
    public static void main(String[] args) {
        // Car c = new Car(); // Cannot instantiate an abstract class
        // BMW beemer = new BMW(); // Cannot instantiate an abstract class
        BMW2 b = new BMW2();
        b.accelerate();
        b.brake();
    }
}
