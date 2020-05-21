package sortingAlgorithms;

public class SelectionSort {

	public static void main(String[] args) {
		
		int [] array = {20, 35, -15, 7, 55, 1, -22};
		int temp = 0;
		
		for(int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
			int largest = 0;
			for (int i = 1; i<lastUnsortedIndex; i++) {
				
				if(array[i] > array[largest]) {
					largest = i;				
				}
			}
			if(array[largest] > array[lastUnsortedIndex]) {
			swap(array,largest,lastUnsortedIndex);
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			}
		}
	
	
	public static void swap(int [] array, int largest, int lastUnsortedIndex) {
		if(largest == lastUnsortedIndex){
			return;
			}
		int temp = array[largest];
		array[largest] = array[lastUnsortedIndex];
		array[lastUnsortedIndex] = temp;
		
	}

}
