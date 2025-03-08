package Interfaces;
interface DefaultInterface {
    default void defaultMethod() {
        System.out.println("Default method in interface.");
    }
}

class DefaultClass implements DefaultInterface {
    public static void main(String[] args) {
        DefaultClass obj = new DefaultClass();
        obj.defaultMethod();
    }
}

