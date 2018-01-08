package leopard.squad.training;


public class CupFactory {

    public Cup createCup(int litres) {
        if(litres < 3){
            return new Cup("small", litres, 1);
        }else if(litres < 15) {
            return new Cup("medium", litres, 2);
        }
        return null;
    }
}
