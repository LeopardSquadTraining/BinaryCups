import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Machine {

    public Machine(){
    }

    public int getCost(int cap){
        Delivery d = new Delivery(cap);
        this.calculate(d);
        int totalCost = d.getCupCost();
        return totalCost;
    }

    public Map<String, Integer> getOrder(int cap){
        Delivery d = new Delivery(cap);
        this.calculate(d);
        int totalCost = d.getCupCost();

        System.out.println(d.getCupsUsed());

        // create the key value pair map of cups used

        Map<String, Integer> cupsUsed = d.getCupsUsed();

        return cupsUsed;
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
