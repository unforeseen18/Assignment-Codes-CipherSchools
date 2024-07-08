package abstraction;

interface Shape {
    double pi = 3.14;

    double getSquare(double r);
}

class Circle implements Shape {
    public double getSquare(double r) {
        return r * r;
    }

    void fun() {
        System.out.println("Hey, I implemented an interface named Shape");
    }
}

public class InterfaceStudy {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.getSquare(5));
        c.fun();
    }
}

// multiple inheritance
package abstraction;

interface M {
    int x = 10;

    void fun();
}

interface N {
    int x = 20;

    void fun();
}

class C implements M, N {
    public void fun() {
        System.out.println("Hello, I'm function in C");
        System.out.println(M.x);
        System.out.println(N.x);
    }
}

interface O extends M, N {
    void fun();
}

class D implements O {
    public void fun() {
        System.out.println("Hello, I'm function in D");
    }
}

public class MultipleInheritanceStudy {
    public static void main(String[] args) {
        C c = new C();
        c.fun();
        D d = new D();
        d.fun();
    }
}
