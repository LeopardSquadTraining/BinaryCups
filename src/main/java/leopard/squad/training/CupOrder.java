package leopard.squad.training;


import java.util.ArrayList;
import java.util.List;

public class CupOrder {

    CupFactory cupFactory;

    public CupOrder() {
        this.cupFactory = new CupFactory();
    }

    public List<Cup> createOrder(int litres){

        List<Cup> order = new ArrayList<>();

       switch(litres) {
           case 1: order.add(new Cup("small", 1, 1));
                   break;
           case 2: order.add(new Cup("small", 2, 1));
                   break;
           case 3: order.add(new Cup("medium", 3, 2));
                   break;
           case 4: order.add(new Cup("small", 2, 1));
                   order.add(new Cup("medium", 2, 2));
                   break;
       }
       return order;
    }

}
