public class BoxPrice extends BoxWeight{
    double cost = 12;

    BoxPrice(){
        super();
        this.cost = -1;

    }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }
    BoxPrice(double l, double h, double w, double weight, double cost){
        super(l, w, h, weight);
        this.cost = cost;
    }
    BoxPrice(double side, double weight, double cost){
        super(side, weight);
        this.cost = cost;
    }
    @Override
    public void information(){
        System.out.println(this.h);
        System.out.println(this.l);
        System.out.println(this.w);
        System.out.println("Running the Box...");
        System.out.println("This is calling from the BoxPrice class");
        System.out.println(this.cost);

    }
    public static void main(String[] args) {
        // BoxWeight boxp1 = new BoxPrice();
        BoxPrice boxp1 = new BoxPrice();
        BoxWeight boxp2 = new BoxPrice(boxp1);
        // System.out.println(boxp1.cost);
        boxp1.information();
    }
    
}
