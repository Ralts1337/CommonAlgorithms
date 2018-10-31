package sortingAlgorithms;

public class MergeSort {
	
	public void mergeSort(int[]arr) {
		
		sortArray(arr,0,arr.length-1);
	}
	//recursively separate the array into 2 parts
	public void sortArray(int[] arr,int low , int high) {
		if(low<high) {
			//pick a mid position
			int mid= (low+high)/2;	
			//sort the left part
			sortArray(arr,low,mid);
			//sort the right part
			sortArray(arr,mid+1,high);
			//merge them
			merge(arr,low,mid,high);
			//done
		}	
	}
	//recursively merge the the sorted arrays
	public void merge(int[] arr, int low,int mid,int high) {
		//create two temp arrays.
		//left 	array will be arr[low] to 	arr[mid]
		//right array will be arr[mid+1] to arr[high]
		//create left temporary array:
		int left_Array_Length	= mid-low+1;
		int[] leftTemp = new int[left_Array_Length];
		//create right temporary array:
		int right_Array_Length	= high-mid;
		int[] rightTemp = new int[right_Array_Length];
		//copy the data from input array to left and right temp arrays
		for(int i=0;i<left_Array_Length;i++) {
			leftTemp[i]=arr[low+i];
		}
		for(int j=0;j<right_Array_Length;j++) {
			rightTemp[j]=arr[mid+1+j];
		}
		//add elements form temp arrays to the input array
		int left = 0;			//counter for leftTemp array
		int right = 0; 			//counter for rightTemp array
		int inputCounter = low;	//counter for input array
		//keep adding elements until either leftTemp or rightTemp reaches the end
		while(left<left_Array_Length && right<right_Array_Length) {
			//add the smaller element of leftTemp and rightTemp to input array
			if(leftTemp[left]<=rightTemp[right]) {
				arr[inputCounter]=leftTemp[left];
				left++;
			}
			else{
				arr[inputCounter]=rightTemp[right];
				right++;
			}
			//move to the next position of input array
			inputCounter++;
		}
		//if either of the Temp arrays reaches an end, add the rest to input array
		while(left<left_Array_Length) {
			arr[inputCounter]=leftTemp[left];
			left++;
			inputCounter++;
		}
		while(right<right_Array_Length) {
			arr[inputCounter]=rightTemp[right];
			right++;
			inputCounter++;
		}
			
	}
		
	
	
	
	public static void main(String[] args) {
		int[] arr = {4,3,2,1};
		MergeSort srt = new MergeSort();
		srt.mergeSort(arr);
		System.out.println("Sorted array:");
		for (int i =0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
