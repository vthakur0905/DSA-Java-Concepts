package B8_OOPs_2;

public class Main {
    public static void main(String[] args) {
//        Human kunal = new Human(22 , "kunal" , 10000, false);
//        Human rahul = new Human(23 , "rahul" , 20000, false);
//        Human shivam = new Human(23 , "shivam" , 20000, false);
//
//        System.out.println(kunal.population);

//        greeting(); --> you cannot call greeting here because it is a non-static method.
//                          and java doesnt allow to call non static method inside static method.
    }

    static void fun(){
        Main obj = new Main();
        obj.greeting();
    }

//    we know that something which is not static, belongs to object.
    void greeting(){
        System.out.println("hello world");
    }
}
