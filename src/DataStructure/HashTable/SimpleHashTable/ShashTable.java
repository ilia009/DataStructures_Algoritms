package DataStructure.HashTable.SimpleHashTable;

/**
 * Created by Admin on 24.08.2019.
 */
public class ShashTable {

    private Employee [] hashtable;

    public ShashTable(){
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee)
    {
        int hashKey = hashKey(key);

        if(hashtable[hashKey] != null){
            System.out.println("Sorry"+ hashKey);
        }
        else {
            hashtable[hashKey]=employee;
        }
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    private  int hashKey(String key){
        return key.length() % hashtable.length;
    }
}
