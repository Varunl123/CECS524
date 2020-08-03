public class Main
{
	public static void main(String[] args) {
		Integer[] array=new Integer[]{12,2,9,14,58,3,7,19,24,15};
		System.out.println("Printing unsorted array now");
		Utility<Integer> u=new Utility<Integer>();
		u.genericDisplay(array);
	    System.out.println("Using linear search for - 4 location at position "+u.linearSearch(array,4));
	    System.out.println("Sorting arary now...");
	    u.bubbleSort(array);
	    System.out.println("Printing sorted array now:");
	    u.genericDisplay(array);
	    System.out.println("Using binary search now - 15 located at position "+u.binarySearch(array,15));
	}
}
