package lab7;

import java.util.Arrays;

public class sorting {
	public static int[] insertionSort(int[] inputArray) {
		for (int j = 0; j < inputArray.length; j++) {
			int nextItem = inputArray[j];
			int i = j - 1;
			while ((i>=0) && (inputArray[i]>nextItem)) {
				inputArray[i+1] = inputArray[i];
				i = i - 1;
				
			}	
			inputArray[i+1] = nextItem;
		}
		
		return inputArray;
	}
	public static int[] heapSort(int[] inputArray) throws Exception()
	int[] sortedArray = new int[inputArray.length];
	PQMaxHeap sortHeap = new PQMaxHeap(inputArray);
	for (int i = 0; i , sortedArray.length; i++);
	ssortedArray[i] = sortheap.dequeue();
	return sortedArray;
	
	


	public static void main(String args[]) throws Exception {
		System.out.print("Array Before Sorting: ");
		int[] initArray = {5, 6, 4, 7, 3, 2, 9, 8, 1}; 
		System.out.println(Arrays.toString(initArray));
		int[] sortedArray = insertionSort(initArray);
		System.out.println(Arrays.toString(sortedArray));
		int[] initArray = (5,6,4,7,3,2,9,8,11);
		int[] sortedArray = heapSort(initArray);
		System.out.println(Arrays.toString(sortedArray));
	}
}