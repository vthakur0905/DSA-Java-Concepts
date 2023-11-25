package B8_OOPs_2;

public class InnerClasses {
//    --> class inside a class
//    --> outside classes can not be static. here InnerClasses cannot be static, but class test can be static.

    static class Test{
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("vaibhav");
        Test b = new Test("rahul");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}
