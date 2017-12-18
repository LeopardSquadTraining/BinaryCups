package leopard.squad.training;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ketaki.sharma on 18/12/2017.
 */
public class BinaryCups {

    CupOrder cupOrder;

    public BinaryCups(){
        this.cupOrder = new CupOrder();
    }

    public List<Cup> dispense(int litres) {

        List<Cup> cups = new ArrayList<>();

        CupFactory cupFactory = new CupFactory();

        if (litres <= 3) {
            cups.add(cupFactory.createCup(litres));
            return cups;
        } else if(litres <15){
            return cupOrder.createOrder(litres);
        }
        return null;
    }
}

