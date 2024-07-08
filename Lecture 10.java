package Keywords;

class Loan {
    int rate;

    Loan() {
        System.out.println("Hi, I'm the default constructor of Loan");
    }

    Loan(int rate) {
        this.rate = rate;
    }

    void printRate() {
        System.out.println(this.rate);
    }
}

class CarLoan extends Loan {
    int rate;

    CarLoan() {
        System.out.println("Hi, I'm the default constructor of CarLoan");
        System.out.println(super.rate);
    }

    CarLoan(int rate) {
        super(7);
        this.rate = rate;
    }

    void printRate() {
        System.out.println(this.rate);
        super.printRate();
        System.out.println(super.rate);
    }
}

public class SuperStudy {
    public static void main(String[] args) {
        CarLoan cl2 = new CarLoan();
        CarLoan cl = new CarLoan(8);
        cl.printRate();
    }
}

// final methods, final keywords, final class
package Keywords;

class A {
    final int noOfAlphabets = 26; // final variables - value once assigned cannot be changed
    final int noOfDigits;

    // either assign the value at the time of declaration or assign the value inside constructor
    A() {
        noOfDigits = 10;
    }

    final void fun() {
        System.out.println("Hi, I'm a function in class A");
    }
}

class B extends A {
    // void fun() {
    //     System.out.println("I'm a function in B overriding function in A");
    // }
}

final class C extends A {} // final classes cannot be inherited
// class D extends C {} // This will cause an error since C is final

public class FinalStudy {
    public static void main(String[] args) {}
}
