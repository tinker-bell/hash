package Hash;


public class HashTable {
    HashBucket[] table;

    public HashTable(int size) {
        table = new HashBucket[size];
//        for (int i = 0; i < size; i++) {
//            table[i] = null;
//        }
    }

    public int hashCode(int key) {
        return key % table.length;
    }

    public void add(int key, int value) {
        int hash = hashCode(key);

        if (table[hash] == null) {
            table[hash] = new HashBucket();
        }

        table[hash].addPair(key, value);
    }

    public int get(int key) throws KeyMissingException {
        int hash = hashCode(key);

        if (table[hash] == null) {
            throw new KeyMissingException();
        }

        return table[hash].getValue(key);
    }

    public void remove(int key) {
        int hash = hashCode(key);

        if (table[hash] != null) {
            table[hash].removeKey(key);
        }
    }
}
