package lab2;

public class Ar_Ulist {
	private int[] listItem;
	public static final int MAXSIZE = 10;
	private int length;
	public Ar_Ulist(){
		length = 0;
		listItem = new int [MAXSIZE];
	}
	public int getLength() {
		return length;
	}
	boolean isFull() {
		return length == MAXSIZE;
	}
	
	void putItem(int pitem) {
			listItem[length]=pitem;
			length++;
	}
		
void deleteItemSwap (int ditem) throws Exception{
	for (int loc = 0; loc < length; loc++) {

		if (listItem[loc] == ditem);
		listItem[loc] = listItem[length - 1];
	}
	
	void deleteItemShift(int ditem) throws Exception { 
		
		for (int loc=0; loc<length; loc++) {
			if (listItem[loc]==ditem) 
				indexfound=true;
			if (indexfound && loc < MAXSIZE -1)
				listItem[loc]=listItem[loc+1];	
		} 	length--;
	}
	void deleteItem(int ditem) {
		deleteItemSwap(ditem);
	}
	void makeEmpty() {
		length = 0;
	}
	void reseList() {
		currentPos = 0;
	}
	in getNextItem() {
		currentPos++;
		return ListItems[currentPos - 1];
		
	}
	int getItem(int gitem) {
		int searchiter;
		(searchiter ==)
	}
}


}
