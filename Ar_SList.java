package Lab3;

public class Ar_SList {
	public static final int MAXSIZE = 10;
	private int[] ListItems;
	private int length;
	private int currentPos = 0;
	
	public Ar_SList() {
		length = 0;
		ListItems = new int[MAXSIZE];
	}
	int getLength() {
        return length;
    }
	
	void putItem(int pitem) {
	    int aloc=0;
	    boolean moreToSearch = aloc < length;
	    while (moreToSearch) {
	    	if (pitem < ListItems[aloc]) 
	    		moreToSearch = false;
	    		
	    	
	    	else 
    			aloc++;
    			moreToSearch = aloc < length;
   
	    }
	    
	    for (int i = length; i > aloc; i--)
	        ListItems[i] = ListItems[i - 1];
	    ListItems[aloc] = pitem;
	    length++;
	}
	
	void deleteItem(int ditem) {
	    int aloc=0;
	    boolean moreToSearch = true;
	    while (moreToSearch && aloc < length) {
	        if (ditem == ListItems[aloc]) 
	        	moreToSearch = false;
	        
	        else 
	        	aloc++;
	        
	    }
	    
	    for (int i = aloc; i < length; i++)
	    	if  (i < MAXSIZE - 1) 
	    		ListItems[i] = ListItems[i + 1];
	    length--;
	    	
	}
	
	int getItem(int gitem) {
	    int midpoint=0, first=0, last=length-1;
	    boolean moreToSearch = first <= last;
	    while (moreToSearch) {
	        midpoint = (first + last/2);
	        if (gitem == ListItems[midpoint])
	        	return midpoint;
	        else if (gitem < ListItems[midpoint])
	        	last = midpoint  - 1;
	        else
	        	first = midpoint + 1;
	        moreToSearch = first <= last;
	        
	        }
		return -1;
	}
	
	void makeEmpty() {
		length = 0;
	}
	
	boolean isFull() {
		return length == MAXSIZE;
	}
	
	void resetList() {
		currentPos= 0;
	}
	
	int getNextItem() {
		currentPos++;
		return ListItems[currentPos -1];
	}
	void printList() {
		System.out.print("(");
		for (int loc = 0; loc < length; loc++) {
			System.out.print(ListItems[loc]);
			if (loc < length -1) {
				System.out.print(", ");
			}
			System.out.println(")");
		}
		
	}

}
