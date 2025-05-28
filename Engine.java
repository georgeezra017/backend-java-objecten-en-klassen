public class Engine {
    private int capacity;
    private int volume;

    public Engine(int capacity, int volume) {
        this.capacity = capacity;
        this.volume = volume;

    }

    public int getVolume() {
        return volume;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity;

    }
}
