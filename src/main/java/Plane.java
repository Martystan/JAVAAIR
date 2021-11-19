public class Plane {
    private String type;
    private int capacity;
    private int weight;

    public Plane(String type, int capacity, int weight) {
        this.type = type;
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }
}
