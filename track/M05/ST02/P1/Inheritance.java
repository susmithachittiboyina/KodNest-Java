
class Demo1 {

    int a = 10;

    void disp1() {
        System.out.println(a);
    }
}

class Demo2 extends Demo1 {

}

public class Inheritance {

    public static void main(String[] args) {
        Demo2 d = new Demo2();
        d.disp1();
    }
}
