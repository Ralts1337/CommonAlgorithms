package defaultPackage;

public class InsertionSort {
	public static void insertionSort(int[] arr) {
		/*
		i ← 1
		while i < length(A)
			j ← i
				while j > 0 and A[j-1] > A[j]
					swap A[j] and A[j-1]
					j ← j - 1
				end while
			i ← i + 1
		end while
		 */
		int n = arr.length;
		int i = 1;
		while(i<n) {
			int j = i;
			while(j>0 && arr[j-1]>arr[j]) {
				swap(arr,j,j-1);
				j--;
			}
			i++;
		}
		
		
	}
	//function to swap array element at position a and b
	public static void swap(int[] arr,int a,int b) {
		int temp= arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}

	
	
}

