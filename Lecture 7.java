package CoreJava;

class Car {
    String name;
    String color;
    int year;
    int maxSpeed;

    void accelerate() {
        System.out.println("Car is accelerating");
    }
}

public class CarStudy {
    public static void main(String[] args) {
        Car polo = new Car();

        System.out.println(polo.name);
        System.out.println(polo.color);
        System.out.println(polo.year);
        System.out.println(polo.maxSpeed);

        polo.name = "Polo";
        polo.color = "Red";
        polo.year = 2016;
        polo.maxSpeed = 120;

        System.out.println(polo.name);
        System.out.println(polo.color);
        System.out.println(polo.year);
        System.out.println(polo.maxSpeed);
    }
}




package CoreJava;

class Student {
    String name;
    int marks;

    boolean checkPass() {
        if (marks > 40) {
            return true;
        } else {
            return false;
        }
    }
}

public class ControlFlow {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.name = "Ram";
        S1.marks = 80;

        Student S2 = new Student();
        S2.name = "Sham";
        S2.marks = 30;

        System.out.println(S1.checkPass());
        System.out.println(S2.checkPass());
    }
}




package CoreJava;

public class ControlFlow {
    int findMax(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static void main(String[] args) {
        ControlFlow cf = new ControlFlow();
        System.out.println(cf.findMax(10, 7, 15));
    }
}

//switch statement
package CoreJava;

public class ControlFlow {
    public static void main(String[] args) {
        char c = 'a';

        switch (c) {
            case 'a':
                System.out.println("Hi, I'm A");
                break;
            case 'b':
                System.out.println("Hi, I'm B");
                break;
            case 'c':
                System.out.println("Hi, I'm C");
                break;
            default:
                System.out.println("I'm not A, B, or C");
        }

        System.out.println("After Switch");
    }
}
