
public class Delivery {
    public int capacity;
    public boolean XL = false;
    public boolean L = false;
    public boolean M = false;
    public boolean S = false;

    public Delivery (int cap){
        this.capacity = cap;
    }

    public int getCost (){
        int x=0;
        if (XL) {
            x=x+8;
        }
        if (L) {
            x=x+4;
        }
        if (M) {
            x=x+2;
        }
        if (S) {
            x=x+1;
        }

        return x;
    }

}
