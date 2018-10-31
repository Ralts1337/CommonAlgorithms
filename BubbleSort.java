package sortingAlgorithms;

public class BubbleSort {
/*Bubble sort checks if the neighbor element is in order. If not, switch them.
 * At the end of each pass, the largest element is at the end position.
 * Therefore, the swapping loop has to be run arr.length-1 times.
 * Time complexity then is n^2
 */
	public static void bubbleSort(int[] arr) {
		int length=arr.length;
		while(length>1) {
			for(int i=0; i<length-1;i++) {
				if(arr[i]>arr[i+1]) {
					int temp = arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			
			
			length--;
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
		bubbleSort(arr);
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
