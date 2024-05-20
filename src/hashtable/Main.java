package hashtable;

public class Main {

    public static void main(String[] args) {

        HashTable myHash = new HashTable();
        myHash.set("nails",100);
        myHash.set("screw",140);
        myHash.set("lumber",80);
        myHash.set("tile",50);
        myHash.set("bolt",20);

        System.out.println(myHash.get("nails"));


        System.out.println(myHash.keys());
    }
}
