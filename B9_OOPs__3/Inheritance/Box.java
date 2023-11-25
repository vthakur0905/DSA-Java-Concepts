package B9_OOPs_3.Inheritance;

public class Box {

    double l;
    double w;
    double h;

    Box() {
        super();
        this.h = -1;
        this.l = -1;
        this.w= -1;
    }

//    for 3 different sides
     Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    //    cube
    Box(double side){
        this.h = side;
        this.l = side;
        this.w = side;
    }

//    copying a constructor
    Box(Box old){
        this.h = old.h;
        this.w = old.w;
        this.l = old.l;
    }

    public void information(){
        System.out.println("running the box");
    }
}
