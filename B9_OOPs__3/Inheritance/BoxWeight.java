package B9_OOPs_3.Inheritance;

public class BoxWeight extends Box {
    double weight ;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l , double h, double w, double weight){
        super(l ,h ,w); //  here "super" calls the constructor from the parent class.
        this.weight = weight;
    }


}
