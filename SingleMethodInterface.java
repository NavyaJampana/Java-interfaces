package Interfaces;
interface SingleMethod {
    void display();
}

class ImplementClass implements SingleMethod {
    public void display() {
        System.out.println("Single method implemented.");
    }

    public static void main(String[] args) {
        ImplementClass obj = new ImplementClass();
        obj.display();
    }
}
