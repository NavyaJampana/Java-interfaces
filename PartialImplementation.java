package Interfaces;

// Interface with two methods
interface TwoMethods {
    void method1();
    void method2();
}

class PartialClass implements TwoMethods {
    public void method1() {
        System.out.println("Method1 implemented.");
    }

    public void method2() {
        System.out.println("Method2 implemented.");
    }

    public static void main(String[] args) {
        PartialClass obj = new PartialClass();
        obj.method1();
        obj.method2(); // Now calling method2 as well
    }
}
