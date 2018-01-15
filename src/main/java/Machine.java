
public class Machine {

    public Machine(){

    }

    public int getCost(int cap){
        Delivery d = new Delivery(cap);
        this.calculate(d);
        return d.getCost();
    }
    public void calculate(Delivery d) {
        if (d.capacity > 9 ){
            d.XL = true;
            d.capacity = d.capacity - 5;
        }
        else if (d.capacity > 5){
            d.L = true;
            d.capacity = d.capacity - 4;
        }
        else if (d.capacity > 2) {
            d.M = true;
            d.capacity = d.capacity - 3;
        }
        else if (d.capacity > 0) {
            d.S = true;
            d.capacity = d.capacity - 2;
        }
        if (d.capacity > 0){
            calculate(d);
        }
    }
}
