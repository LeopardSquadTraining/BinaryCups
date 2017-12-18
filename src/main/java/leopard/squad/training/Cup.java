package leopard.squad.training;

public final class Cup {

    private final String cupSize;
    private final int fillLevelInLitres;
    private final int cost;

    public Cup(String cupSize, int fillLevel, int cost) {
        this.cupSize = cupSize;
        this.fillLevelInLitres = fillLevel;
        this.cost = cost;
    }

    public String getCupSize() {
        return cupSize;
    }

    public int getFillLevelInLitres() {
        return fillLevelInLitres;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cup cup = (Cup) o;

        if (fillLevelInLitres != cup.fillLevelInLitres) return false;
        if (cost != cup.cost) return false;
        return cupSize != null ? cupSize.equals(cup.cupSize) : cup.cupSize == null;
    }

    @Override
    public int hashCode() {
        int result = cupSize != null ? cupSize.hashCode() : 0;
        result = 31 * result + fillLevelInLitres;
        result = 31 * result + cost;
        return result;
    }

    @Override
    public String toString() {
        return "Cup{" + "cupSize='" + cupSize + '\'' + ", fillLevelInLitres=" + fillLevelInLitres + ", cost=" + cost + '}';
    }
}

