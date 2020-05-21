package sortingAlgorithms;

public class Array {
	
	public static void main(String[] args) {
		int[] intArray = new int[7]; 
		
		intArray[0] = 20;
		intArray[1] = 35;
		intArray[2] = -15;
		intArray[3] =7;
		intArray[4] = 55;
		intArray[5] = 1;
		intArray[6] = -22;
		
		for(int i = 0; i < intArray.length; i++) {
			//System.out.println(intArray[i]);
		}
		
		bubbleSort(intArray);
		
	
	}
	
	public static void bubbleSort(int[] array) {
		
		int partition = 0;
		for(int i = array.length-1; i >= 0; i--) {
			partition = i;
			for(int j = 0; j < i; j++) {
				if(array[j]>array[j+1]) {
					
					array[j] = array[j+1];
					array[j+1] = array[j];
				}
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		
	}
}
