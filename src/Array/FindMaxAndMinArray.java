package Array;

import java.util.Arrays;

public class FindMaxAndMinArray {
	SortArray obj = new SortArray();

	public int findMax(int[] arr) {
		int[] big = obj.sortDescending(arr);
		return big[0];
	}

	public int findMin(int[] arr) {
		int[] small = obj.sortAscending(arr);
		return small[0];
	}

	public static void main(String args[]) {
		int[] numArray = { 7, 2, -1, 3, 0, -9, 4, 6 };
		FindMaxAndMinArray obj = new FindMaxAndMinArray();
		System.out.println("Array: " + Arrays.toString(numArray));
		System.out.println("Maximum Num: " + obj.findMax(numArray));
		System.out.println("Minimum Num: " + obj.findMin(numArray));
	}

}
