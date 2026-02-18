package lab6;

public class Ar_UList {
	//Use private variables to preserve Encapsulation 
	public static final int MAXSIZE = 250000;	
	private int[] ListItems;
	private int length;
	private int currentPos = 0;
	
	public Ar_UList() {
		length = 0; //a newly constructed list has 0 elements
		ListItems = new int[MAXSIZE];
	}
	boolean isFull()  {
		return (length == MAXSIZE); //Useful to check that we don't add too many elements	 	
	}
	
	int getLength() {
	  return length;
	}

	int getItem(int gitem) {
		int searchiter;
		for (searchiter = length-1; searchiter>=0; searchiter--) { //main loop decrements from the final index in the list down to -1 
			if (ListItems[searchiter] == gitem) //if this condition is met, we have a match
				break;  //break terminates the innermost-loop in progress (so in this case, the for-loop)
		} 
			return searchiter;
	}
	
	void makeEmpty() {
		length = 0; //as with the constructor, we need do nothing to the actual array, as it now "junk" data
	}
	
	void putItem(int pitem) {
		 ListItems[length] = pitem; //Reminder that Java uses 0-indexing.
		 length++;
	}
	
	void deleteItemShift(int ditem) { //This is the less efficient version of what we discussed ("Move-Up") that maintains list order		
		boolean indexfound=false;
		for (int loc=0; loc<length; loc++) {
			if (ListItems[loc]==ditem) 
				indexfound=true;
			if (indexfound && loc < MAXSIZE - 1)
				ListItems[loc]=ListItems[loc+1];	
		}
		length--;
	}

	void deleteItemSwap(int ditem) { //This is the more efficient version of what we discussed ("Swap") that is a little bit easier and faster		
		  for (int loc=0; loc<length; loc++) {
			  if (ListItems[loc]==ditem) { 
				  ListItems[loc] = ListItems[length-1];
				  return;
			  }
		  }
		 
	}

	
	void deleteItem(int ditem) {
		deleteItemShift(ditem);
	}
	
	void resetList() {
		currentPos = 0;
	}

	
	int getNextItem() {
		//Possibly counter-intuitive, but we want to return the item at the current index AND increment it
		currentPos++;
		return ListItems[currentPos-1];   
	}

	void printList() { //simple function to print a list's items in stored order
		System.out.print("(");
		for (int loc=0; loc<length; loc++) {
		  	System.out.print(ListItems[loc]);
			if (loc<length-1)
		  	  System.out.print(", ");
		}
		System.out.println(")");
	}
}

