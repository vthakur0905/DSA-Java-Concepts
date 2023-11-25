package B9_OOPs_3.Inheritance;

public class Main {
    public static void main(String[] args) {

        Box box1 = new Box(); // matching with the parameters in the box.java file it is choosing which constructor to call.
        System.out.println("box1--> "+ box1.h + " " + box1.l + " " + box1.w);

        System.out.println("---------------------------------------");

        Box box2 = new Box(4); // again matching with the arguments.
        System.out.println("box2--> "+ box2.h + " " + box2.l + " " + box2.w);

        System.out.println("---------------------------------------");

        Box box3 = new Box(4 , 5 , 6); // again matching with the arguments.
        System.out.println("box3--> "+ box3.h + " " + box3.l + " " + box3.w);

        System.out.println("---------------------------------------");

        BoxWeight box4 = new BoxWeight();
        System.out.println("box4--> " + box4.weight);

        System.out.println("---------------------------------------");

        BoxWeight box5 = new BoxWeight(4 , 5, 6 , 9);
        System.out.println("box5--> "+ box5.h + " " + box5.l + " " + box5.w + " " + box5.weight);

        System.out.println("---------------------------------------");

        Box box6 = new BoxWeight(2, 3, 4, 5);
        System.out.println("box6--> " + box6);

        System.out.println("---------------------------------------");

        Boxprice box7 = new Boxprice(2,3,4,5,6);
        System.out.println(box7.cost);





    }
}
