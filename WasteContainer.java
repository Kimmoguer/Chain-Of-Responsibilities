public class WasteContainer {

    private WasteType type;
    private int capacity;
    private boolean isFull;

    public WasteContainer(WasteType type, int capacity, boolean isFull) {
        this.type = type;
        this.capacity = capacity;
        this.isFull = isFull;
    }

    public WasteType getType() {
        return type;
    }

    public void setType(WasteType type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    @Override
    public String toString() {
        return "WasteContainer{" +
                "type=" + type +
                ", capacity=" + capacity +
                ", isFull=" + isFull +
                '}';
    }
}