package sortingAlgorithms;

public class ShellSort {

	public static void main(String[] args) {
		int [] intArray = {20, 35, -15, 7, 55, 1, -22, 1, 2, 3, 4, 5};
		
		ShellSort(intArray);
		
		for(int i= 0; i < intArray.length; i++) {
			System.out.println(intArray[i]);
		}
	}
	
	public static void ShellSort(int[] intArray) {
		
		for (int gap = intArray.length / 2; gap > 0; gap/=2) {
			
			for( int i = gap; i < intArray.length; i++) {
				int newElement = intArray[i];
				
				int j = i;
				while(j>=gap && intArray[j-gap] > newElement) {
					intArray[j] = intArray[j-gap];
					j-= gap;
				}
				
				intArray[j] = newElement;
			}
			
		}
	}
	
	//public void InsertionS
	
}
