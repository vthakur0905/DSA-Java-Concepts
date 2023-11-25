package B9_OOPs_3.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Sqaure sqaure= new Sqaure();
        Circle circle = new Circle();
//        Shapes circle = new Circle();

        shape.area();
        circle.area();
        sqaure.area();
    }
}
