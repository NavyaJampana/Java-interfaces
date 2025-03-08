package Interfaces;
interface MyInterface {
    void show();
}

class MyClass implements MyInterface {
    public void show() {
        System.out.println("Method called using interface instance.");
    }

    public static void main(String[] args) {
        MyInterface obj = new MyClass();
        obj.show();
    }
}
