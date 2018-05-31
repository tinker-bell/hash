package Hash;

import Hash.Pair;

import Hash.KeyMissingException;

public class HashBucket {
    private Pair[] chain;

    public HashBucket() {
        this.chain = new Pair[100];
    }

    public void addPair(int key, int value) {
        for (int i = 0; i < this.chain.length; i++) {
            if (this.chain[i] == null) {
                this.chain[i] = new Pair(key, value);
                break;
            }
        }
    }

    public int getValue(int key) throws KeyMissingException {
        for (int i = 0; i < this.chain.length; i++) {
            if (this.chain[i] != null && this.chain[i].getKey() == key) {
                return this.chain[i].getValue();
            }
        }

        throw new KeyMissingException();
    }

    public void removeKey(int key) {
        for (int i = 0; i < this.chain.length; i++) {
            if (this.chain[i].getKey() == key) {
                this.chain[i] = null;
                break;
            }
        }
    }
}
