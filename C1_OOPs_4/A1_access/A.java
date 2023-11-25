package C1_OOPs_4.A1_access;

public class A {
    protected static int num ;
    String name;
    int[] arr ;

//   GETTER
    public int getNum() {
        return num;
    }

//    SETTER
    public int setNum(){
        return num;
    }

    public A(int num, String name){
        this.num = num ;
        this.name = name;
        this.arr = new int[num] ;
    }

}

class B{

}
