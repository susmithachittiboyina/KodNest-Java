
abstract class Parent {

    abstract void disp1();

    abstract void disp2();
}

class Child1 extends Parent {

    @Override
    void disp1() {
        System.out.println("Inside Chiid 1 disp 1");
    }

    @Override
    void disp2() {
        System.out.println("Inside Child 1 disp 2");
    }
}

class Child2 extends Parent {

    @Override
    void disp1() {
        System.out.println("Inside Child2 disp 1");
    }

    @Override
    void disp2() {
        System.out.println("Inside Child2 disp 2");
    }
}

public class Abstract1 {

    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        Child2 ch2 = new Child2();
        accessMethod(ch1);
        accessMethod(ch2);
    }

    static void accessMethod(Parent ref) {
        ref.disp1();
        ref.disp2();
    }
}
