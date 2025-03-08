package Interfaces;
interface First {
    void methodA();
}

interface Second {
    void methodB();
}

class MultiClass implements First, Second {
    public void methodA() {
        System.out.println("Method A from First interface.");
    }

    public void methodB() {
        System.out.println("Method B from Second interface.");
    }

    public static void main(String[] args) {
        MultiClass obj = new MultiClass();
        obj.methodA();
        obj.methodB();
    }
}
