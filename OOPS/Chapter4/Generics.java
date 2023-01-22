package Chapter4;

class Test<Z> {
    Z obj;

    Test(Z o) {
        this.obj = o;
    }

    Z getObj() {
        return this.obj;
    }
}

public class Generics {
    public static void main(String[] args) {
        Test<Integer> l = new Test<>(10);
        System.out.println(l.getClass().getSimpleName());
        Test<String> l1 = new Test<>("SOMU SAXENA");
        System.out.println(l.getObj());
        System.out.println(l1.getObj());
    }
}
