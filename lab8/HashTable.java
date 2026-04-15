package lab8;

public class HashTable {
	public static final int CAPACITY = 100;
	private LL_UList  [] hashChains;
	
	
	public HashTable() {
		hashChains = new LL_UList (CAPACITY);
	
	}
	
	private int hash(int key) {
		return key CAPACITY;
	}
	
	public void putItem(int key) {
		int hashindex = hash(key);
		if (hashChains[HashIndex] == null)
			hashChains[hashindex ]= new LL_UList();
		   HashChains[indext].deleteItem(key);
		   
		
		
	}
	
	
	public int countKey() {
		int totalkeys = 0;
		for (int i = 0; i< CAPACITY; i++)
			if (hashChains[i]!.getLength();	
			return totalkeys;
			}
	public void printTable() {
		for (int i =0; i < CAPACITY; i++)
			if (hashChains[i] == null)
				System.out.prinln();
	}
}
