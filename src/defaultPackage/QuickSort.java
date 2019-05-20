package defaultPackage;

public class QuickSort {
	//Initial parameters:
	//low: 0
	//high: arr.length-1  (position of last element of array)
	
	 static void quickSort(int arr[], int low, int high) 
	    { 
	        if (low < high) 
	        { 	
	            //pick p as pivot
	            int p = partition(arr, low, high); 						
	            //recursively sort the left and right array of pivot
	            quickSort(arr, low, p-1); 			
	            quickSort(arr, p+1, high);			
	        } 
	        //stops if there's only 1 element
	    } 
	 
	public static int partition(int[] arr, int low, int high) 
    { 
        int pivot = arr[(low+high)/2]; 	//pivot = middle element
        int i= low;						//counter, starts at the left side of array, moves toward right
        int j= high;					//counter, starts at the right side of array, moves toward left
        //System.out.println("Partition Called");
        while(i<=j) {     	
        	//find the first element that is smaller than pivot (from left to right)
	        while(arr[i]<pivot) {
	        	//System.out.println("Program reached this i while loop with i="+i+" with pivot ="+pivot);
	        	i++;
	        }
	        //find the first element that is larger than pivot (from right to left)
	        while(arr[j]>pivot) {
	        	//System.out.println("Program reached this j while loop with j="+j+"with pivot ="+pivot);
	        	j--;
	        }
	        //switch them (element bigger than pivot should stay in the right of the pivot. vise versa)
	        //then move on
        	 if(i<=j) {
	        	 swapPosition(arr,i,j);
	        	 //System.out.println("After Swap:");
	        	 //printArray(arr);
	        	 //System.out.println("i="+i+" j="+j+" pivot="+pivot);
	        	 i++;
	        	 j--;
        	 }
        }
       //after everything finishes, return the pivot position
       return j;
    } 
	
	//method to swap position of two array elements
	public static void swapPosition(int[] arr,int a,int b) {
				 int temp= arr[b];
				 arr[b]=arr[a];
				 arr[a]=temp;
			 }
		
		
	//Testing it with multiple same elements
	public static void main(String[] args) {
		int[]arr= {10,10,10,9,9,8,8,8,1};
		quickSort(arr,0,arr.length-1);
		printArray(arr);
	}
	
	//method to print the whole array
	public static void printArray(int[]arr) {
		for(int y=0;y<arr.length;y++) {
			System.out.print(arr[y]+",");
			
		}
		System.out.println("");
	}

}
