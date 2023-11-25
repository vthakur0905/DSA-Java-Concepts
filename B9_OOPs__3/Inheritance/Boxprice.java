package B9_OOPs_3.Inheritance;

// here boxprice class is connected to all the above classes and it will access to variables and methods of above classes.
public class Boxprice extends BoxWeight {

    double cost;

    Boxprice(){
        super();
        this.cost = -1;
    }

    public Boxprice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }
}
