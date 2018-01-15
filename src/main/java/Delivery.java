import java.util.ArrayList;
import java.util.List;

public class Delivery {
    public int capacity;
    public boolean XL = false;
    public boolean L = false;
    public boolean M = false;
    public boolean S = false;
    private List<String> cupsUsed;

    public Delivery (int cap)
    {
        this.capacity = cap;
        this.cupsUsed=new ArrayList<>();
    }

    public int getCupCost (){
        int x=0;
        if (XL) {
            x=x+8;
            cupsUsed.add("XL");
        }
        if (L) {
            x=x+4;
            cupsUsed.add("L");
        }
        if (M) {
            x=x+2;
            cupsUsed.add("M");
        }
        if (S) {
            x=x+1;
            cupsUsed.add("S");
        }
        return x;
    }

    public List<String> getCupsUsed() {
        return cupsUsed;
    }
}
