/**
 * 
 */
package defaultPackage;

/**
 * @author Adam Xu
 * An improvement to insertion and bubble sort
 * 
 */
public class ShellSort {

	/**
	 *  pick increments x1,x2,x3... For example: 1,3,5...
	 *  Starting from the largest increment, make x sublists.
	 *  For example, if x=5, then make 5 sublists, increasing the
	 *  position of array by 5, the sublists picked would be:
	 *  1st:a[0],a[5],a[10]...
	 *  2nd:a[1],a[6],a[11]...
	 *  3rd:a[2],a[7],a[12]...
	 *  4th:a[3],a[8],a[13]...
	 *  5th:a[4],a[9],a[14]...
	 *  Sort these 5 sublists by bubble sort.
	 *  Then pick next x=3, make 3 sublists, sort by bubbleSort
	 *  Then pick next x=1, make 1 sublist , sort by bubbleSort
	 *  The best known sequence for x is :
	 *  1,4,10,23,57,132,301,701...
	 *  check wikipedia for the gap x.
	 *  Here we only use 1,4,10 as demonstration.
	 */
	public static void shellSort(int[] array) {
		//separate the array by gap(increment) of 10,4,1
		int[] gapArray = {10,4,1};	
		//loop: sublists with increments of 10,4,1
		for (int gap:gapArray) {
			System.out.println("gap="+gap);
			//loop: sublists beginning with arr[0],arr[1]...arr[gap](not included)
			for(int arrayCounter=0;arrayCounter<gap;arrayCounter++) {
				System.out.print(arrayCounter+",");
				//loop:sort the sublist by bubble sort
				//System.out.print("Array at "+arrayCounter+" is:"+array[arrayCounter]);
				int bubbleCounter = arrayCounter;
				while(bubbleCounter<array.length) {
					for(int i=bubbleCounter;i+gap<array.length;i+=gap) {
						if(array[i]>array[i+gap]) {
							int temp=array[i];
							array[i]=array[i+gap];
							array[i+gap]=temp;
						}
					}
					bubbleCounter+=gap;
				}
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//generate an array from 19 to 0
		int[] test = new int[20];
		int i = 19;
		int j = 0;
		while(i>=0 && j<20) {
			test[j]=i;
			i--;
			j++;
		}
		//sort the array
		shellSort(test);
		//print the array
		for (int k=0;k<test.length;k++) {
			System.out.print(test[k]+" ");
		}
	}

}
