package defaultPackage;
import java.util.Random;


public class Test {
	
	private int x=0;
	private int y=0;
	private int z=0;
	private int temp=0;
	Random rand = new Random();
	private int[] testArray=new int[14];
	
	/*creates a new array size 16 with random numbers*/
	public Test() {
		
		while(testArray[testArray.length-1]==0) {
			temp = rand.nextInt(100)+1;
			if(!contains(testArray,temp)) {
				testArray[x]=temp;
				x++;
			}
		}
	}
	
	/*Used in Test(). Check if array already contains some value*/
	public static boolean contains(int[]array,int targetValue) {
		boolean judge=false;
		
		for(int i=0;i<array.length;i++) {
			if (array[i]==targetValue){
				judge=true;
			}
		}
		return judge;
	}
	
	/*print the array to see the results*/
	public static void testPrint(int[]arr) {
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+",");
		}
		System.out.print(arr[arr.length-1]);
	}
	
	/*The main activity. It calls HeapSort*/
	public static void main (String[]args) {
		//add block comment: ctrl+shift+/, 
		//remove: ctrl+shift+\
		Test test=new Test();
		System.out.print("Original Array is:\n");
		testPrint(test.testArray);
		System.out.print("\n");
		//-----Call sorting algorithms here:-----
		/*HeapSort heap=new HeapSort();
		heap.sort(test.testArray);
		System.out.print("HeapSort:\n");*/
		InsertionSort s = new InsertionSort();
		s.insertionSort(test.testArray);
		
		//-----End calling sorting algorithms-----
		
		System.out.println("After sort: ");
		test.testPrint(test.testArray);
		System.out.print("\n");
		
		/*Test test2=new Test();
		System.out.print("Original Array is:\n");
		test2.testPrint(test2.testArray);
		SelectionSort selection=new SelectionSort();
		selection.selectionSort(test2.testArray);
		System.out.print("\nSelectionSort:\n");
		test2.testPrint(test2.testArray);*/
		
		
		
	}
	
}
