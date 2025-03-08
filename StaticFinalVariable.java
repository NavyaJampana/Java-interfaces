package Interfaces;
interface StaticFinalInterface {
    static final int CONSTANT = 42;
}

class StaticFinalClass implements StaticFinalInterface {
    public static void main(String[] args) {
        System.out.println("Constant value: " + CONSTANT);
    }
}

