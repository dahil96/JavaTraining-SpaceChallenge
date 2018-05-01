public class Item {
    private String name;
    private int weight;

    public Item() {
        name = "";
        weight = 0;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setWeight(int weight) {
        this.weight = weight;
    }
}
