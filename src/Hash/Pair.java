package Hash;

public class Pair {
    private int key;
    private int value;

    public Pair(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public int getKey() {
        return this.key;
    }
}
