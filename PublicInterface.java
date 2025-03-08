package Interfaces;
interface PublicInterface {
    int VALUE = 100; 
    void display();
}

class PublicClass implements PublicInterface {
    public void display() {
        System.out.println("Value: " + VALUE);
    }

    public static void main(String[] args) {
        PublicClass obj = new PublicClass();
        obj.display();
    }
}

