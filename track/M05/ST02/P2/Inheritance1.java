
class Parent {

    public Parent() {
        System.out.println("Inside parameter 0 constructor");
    }
}

class Child extends Parent {

    public Child() {
        System.out.println("Inside child 0 constructor");
    }
}

class Inheritance1 {

    public static void main(String[] args) {
        Child c1 = new Child();
    }
}
