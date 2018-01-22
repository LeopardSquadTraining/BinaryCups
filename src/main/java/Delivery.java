import java.util.HashMap;
import java.util.Map;

public class Delivery {
    public int capacity;
    public boolean XL = false;
    public boolean L = false;
    public boolean M = false;
    public boolean S = false;
    private Map<String, Integer> cupsUsed;

    public Delivery (int cap)
    {
        this.capacity = cap;
        this.cupsUsed = new HashMap<>();
    }

    public int getCupCost (){
        int x=0;
        if (XL) {
            x=x+8;
            cupsUsed.put("XL", 0);
        }
        if (L) {
            x=x+4;
            cupsUsed.put("L", 0);
        }
        if (M) {
            x=x+2;
            cupsUsed.put("M", 0);
        }
        if (S) {
            x=x+1;
            cupsUsed.put("S", 0);
        }
        return x;
    }

    public Map<String, Integer> getCupsUsed() {
        return cupsUsed;
    }
}
