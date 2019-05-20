package defaultPackage;
/*
 *	Geeks for Geeks website , quicksort
 */
public class QuickSort {
	//Initial parameters:
	//low: 0
	//high: arr.length-1  (position of last element of array)
	
	 public void quickSort(int arr[], int low, int high) 
	    { 
	        if (low < high) 
	        { 	
	           //bLomuto:
	           //int p = partition(arr, low, high); 						
	           // quickSort(arr, low, p-1); 			
	           // quickSort(arr, p+1, high);			
	           //Hoare:
	        	int p = partition(arr,low,high);
	        	//System.out.println(p);
	        	quickSort(arr,low,p-1);
	        	quickSort(arr,p+1,high);
	        } 
	        //stops if there's only 1 element
	    } 
	 //bLomuto partition scheme:
	private int partition(int[] arr, int low, int high) 
    { 
       int pivot = arr[high]; 			//pivot = last element
       int i= low-1;					
       
	   for(int j= low;j<high;j++) {		//swap elements>=pivots to the right side
		   if(arr[j]<=pivot) {
			   i++;
			   swap(arr,i,j);
		   }
	   }
	   swap(arr,i+1,high);
      
       return i+1;
    } 
	//Hoare partition scheme:
	private int partition2 (int[]arr, int low, int high) {
		int pivot = arr[low+(high-low)/2];	//pick the middle element
		int i = low;						//find element >pivot
		int j = high;						//find element <pivot
											//swap them.
		while(true) {
			while(arr[i]<pivot) {
				i++;
			}
			while(arr[j]>pivot && j>0) {
				j--;
			}
			if(i<j) {
				swap(arr,i,j);
				i++;
				j--;
			}else {
				break;
			}
		}
		return i;
		
	}
	
	
	//Swap position of two array elements
	private void swap(int[] arr,int a,int b) {
				 int temp= arr[b];
				 arr[b]=arr[a];
				 arr[a]=temp;
			 }

}
