package B8_OOPs_2;

// --> this is an example to show initialisation of static variables.
// --> the static block will get executed once only when the classes first loaded.

public class StaticBlock {
    static int a= 4;
    static int b;
//  --> these above static variables are not dependent on objects.

    static {
        System.out.println(" i am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

//      --> when we will run this code the static variables or the static blocks will be executed first
//          and only once (when the first object is created.)


    }
}

   