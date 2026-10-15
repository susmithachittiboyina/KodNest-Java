
class Parent {

    public Parent() {
        System.out.println("Inside parent 0 constructor");
    }
}

class Child extends Parent {

    public Child() {
        this(10);
        System.out.println("Inside child 0 constructor");
    }

    Child(int a) {
        this(10, 20);
        System.out.println("Inside child 1 constructor");
    }

    Child(int a, int b) {
        System.out.println("Inside child 2 constructor");
    }
}

public class Inheritance2 {

    public static void main(String[] args) {
        Child c1 = new Child();
    }
}
