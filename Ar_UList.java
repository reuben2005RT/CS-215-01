package Lab2;

public class Ar_UList {
	private int [] ListItems{
		public static final int maxsize= 10;
		private int length;
		private int currentPos;
		
		public Ar_UList() {
			length = 0;
			ListItems= new int [maxsize];
		}
		public int getLength() {
			return length;
		}
		
		boolean isFull() {
			return length == maxsize;
		}
		
		void putItem(int pitem) {
			ListItems [length] = pitem;
			length++;
		}
		void deleteItemSwap(int ditem) throws Exception {
			for (int loc = 0; loc < length; loc++) {
				if (ListItems[loc] == ditem){
					ListItems[loc] = ListItems[length-1];
					break;
				}
			}
			length--;	
		}
		void deleteItemShift(int ditem) throws Exception { 
			boolean indexfound = false;
			for (int loc=0; loc<length; loc++) {
				if (ListItems[loc] == ditem) 
					indexfound=true;
				if (indexfound && loc< maxsize - 1)
					ListItems[loc]=ListItems[loc+1];	
			}
			length--;
		}
		void deleteItem (int ditem) {
			deleteItemSwap(ditem);
		}
		void MakeEmpty() {
			length = 0;
		}
		void resetList() {
			currentPos = 0;
		}
		int getNextItem() {
			currentPos++;
			return ListItems[currentPos-1];
		}
		int getItem(int gitem){
			int searchiter;
			for (searchiter = length-1; searchiter >= 0; searchiter--) {
				if (ListItems[searchiter] == gitem)
					break;
			}
		}
	}
}
