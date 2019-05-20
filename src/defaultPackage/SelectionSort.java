/**
 * 
 */
package defaultPackage;

/**
 * @author ASUS
 *
 */
public class SelectionSort {

	/**
	 * sort the array in ascending order:largest in the last slot
	 */
	static void selectionSort(int[]arr) {
		int length = arr.length;
		int max = 0;
		while(length>0) {
			for(int i=1;i<length;i++) {
				if (arr[i]>arr[max]) {
					max=i;
				}
			}
		int temp=arr[max];
		arr[max]=arr[length-1];
		arr[length-1]=temp;
		max=0;	
		length--;	
		}
	}
/*public static void main(String[] args) {
		int[] test= {5,4,3,2,1};
		selectionSort(test);
		for(int i=0;i<test.length;i++) {
			System.out.print(test[i]+" ");
		}
	}*/
}
