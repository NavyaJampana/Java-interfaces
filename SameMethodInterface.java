package Interfaces;
interface FirstInterface {
    void commonMethod();
}

interface SecondInterface {
    void commonMethod();
}

class SameMethodClass implements FirstInterface, SecondInterface {
    public void commonMethod() {
        System.out.println("Common method implementation.");
    }

    public static void main(String[] args) {
        SameMethodClass obj = new SameMethodClass();
        obj.commonMethod();
    }
}
