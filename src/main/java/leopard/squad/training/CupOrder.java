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
           case 5: order.add(new Cup("small", 2, 1));
                   order.add(new Cup("medium", 3, 2));
                   break;
           case 6: order.add(new Cup("small", 2, 1));
                   order.add(new Cup("large", 4, 4));
                   break;
           case 7: order.add(new Cup("medium", 3, 2));
                   order.add(new Cup("large", 4, 4));
                   break;
           case 8: order.add(new Cup("small", 2, 1));
                   order.add(new Cup("medium", 3, 2));
                   order.add(new Cup("large", 3, 4));
                   break;
           case 9: order.add(new Cup("small", 2, 1));
                   order.add(new Cup("medium", 3, 2));
                   order.add(new Cup("large", 4, 4));
                   break;
           case 10: order.add(new Cup("small", 2, 1));
                    order.add(new Cup("medium", 3, 2));
                    order.add(new Cup("extra-large", 5, 8));
                    break;
           case 11: order.add(new Cup("small", 2, 1));
                    order.add(new Cup("large", 4, 4));
                    order.add(new Cup("extra-large", 5, 8));
                    break;
           case 12: order.add(new Cup("medium", 3, 2));
                    order.add(new Cup("large", 4, 4));
                    order.add(new Cup("extra-large", 5, 8));
                    break;
           case 13: order.add(new Cup("small", 1, 1));
                    order.add(new Cup("medium", 3, 2));
                    order.add(new Cup("large", 4, 4));
                    order.add(new Cup("extra-large", 5, 8));
                    break;
           case 14: order.add(new Cup("small", 2, 1));
                    order.add(new Cup("medium", 3, 2));
                    order.add(new Cup("large", 4, 4));
                    order.add(new Cup("extra-large", 5, 8));
                    break;
       }
       return order;
    }

}
