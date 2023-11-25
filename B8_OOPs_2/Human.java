package B8_OOPs_2;

public class Human {
    public static void main(String[] args) {
        
    }
    int age;
    String name;
    int salary;
    boolean married;
    static long population ; // this is used for the variable which is same for all objects.

    public Human(int age, String name, int salary, boolean married){
        this.age = age ;
        this.name = name ;
        this.salary = salary ;
        this.married = married ;
        Human.population += 1 ;
    }

}

