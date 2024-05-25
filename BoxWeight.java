public class BoxWeight extends Box{

    double weight;
 
    BoxWeight(){
        this.weight = -1;
    }

    BoxWeight(double l, double h, double w, double weight){
        super(l, w, h);

        this.weight = weight;

    }
    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
    BoxWeight(BoxWeight old){
        super();
        this.weight = 12;
    }


    public static void main(String[] args) {
        
    }
}
