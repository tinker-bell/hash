import Hash.HashTable;
import Hash.KeyMissingException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class test {

    @Test
    public void test() throws KeyMissingException {
        HashTable hashTable = new HashTable(8);
        hashTable.add(1, 2);
        hashTable.add(2, 3);
        hashTable.add(3, 4);
        hashTable.add(4, 5);
        hashTable.add(5, 6);
        hashTable.add(6, 7);
        hashTable.add(7, 8);
        hashTable.add(8, 9);
        hashTable.add(9, 10);
        hashTable.remove(4);

        Assertions.assertNotNull(hashTable.get(2));
        Assertions.assertNotNull(hashTable.get(3));
        Assertions.assertThrows(KeyMissingException.class, () -> hashTable.get(4));
    }
}


