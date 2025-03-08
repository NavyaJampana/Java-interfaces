package Interfaces;
interface ParentInterface {
    void parentMethod();
}

interface ChildInterface extends ParentInterface {
    void childMethod();
}

class InheritedClass implements ChildInterface {
    public void parentMethod() {
        System.out.println("Parent method implemented.");
    }

    public void childMethod() {
        System.out.println("Child method implemented.");
    }

    public static void main(String[] args) {
        InheritedClass obj = new InheritedClass();
        obj.parentMethod();
        obj.childMethod();
    }
}