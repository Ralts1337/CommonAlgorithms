package sortingAlgorithms;

public class InsertionSort {
	public static void insertionSort(int[] arr) {
		int length=arr.length;
		/* Counter starts at arr[1] and traverses through
		 * the array. The algorithm considers the array 
		 * position before the counter as sorted. Then it
		 * compares the next position with the sorted part
		 * and insert it into its proper place*/
		for(int counter=1;counter<length;counter++) {
			int j=counter-1;		//
			//put element@counter to its proper position
			while(j>=0 && arr[j]>=arr[j+1]) {
				swap(arr,j,j+1);
				//swap j and counter
				j=j-1; //check the previous position
			}
		}
		
		
	}
	//function to swap array element at position a and b
	public static void swap(int[] arr,int a,int b) {
		int temp= arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

	public static void main(String[]args) {
		int[] arr = {8,8,7,6,5,4,3,2,1};
		insertionSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");
		}
	}
	
}

