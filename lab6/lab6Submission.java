package lab6;

import java.time.*;

public class lab6Submission {
	
	public static void Main(String[] args) {
		Ar_UList myAr_UList = new Ar_UList();
		
		LocalDateTime t1 = LocalDateTime.now();
		for (int i=1; i<250000; i++)
			myAr_UList.putItem(i);
		
		 
		LocalDateTime t2 = LocalDateTime.now();
		System.out.println(Duration.between(t1,t2).toMillis();
		lovalDateTime t3 = localDateTime.vow();
		for (int i = 1; i<250000; i++);
		myAr_Ulist.getItem(i);
		
		lovalDateTime t4 = localDateTime.now();
		System.out.println("");
		
		
	}
	public static void Main(String[] args) {
		Ar_SList myAr_SList = new Ar_SList();
		
		LocalDateTime t5 = LocalDateTime.now();
		for (int i=1; i<250000; i++)
			myAr_SList.putItem(i);
		
		 
		LocalDateTime t6 = LocalDateTime.now();
		System.out.println(Duration.between(t1,t2).toMillis();
		lovalDateTime t7 = localDateTime.vow();
		for (int i = 1; i<250000; i++);
		myAr_Slist.getItem(i);
		
		lovalDateTime t8 = localDateTime.now();
		System.out.println("");
		
		
	}

}
