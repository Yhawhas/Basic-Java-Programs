package Array;

import java.util.Arrays;

public class SortArray {
	public int[] sortAscending(int[] arr) {

		int length = arr.length;
		int temp = 0;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}

	public int[] sortDescending(int[] arr) {

		int length = arr.length;
		int temp = 0;
		for (int i = 0; i < length; i++) {
			for (int j = i + 1; j < length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String args[]) {
		SortArray obj = new SortArray();
		int[] arr = { 3, 4, 1, 2, -2, 6, -1, -3, 0, 5 };
		System.out.println("Array: " + Arrays.toString(arr));

		int[] sortedAscendingArray = obj.sortAscending(arr);
		System.out.println("Ascending Array: " + Arrays.toString(sortedAscendingArray));

		int[] sortedDescendingArray = obj.sortDescending(arr);
		System.out.println("Descending Array: " + Arrays.toString(sortedDescendingArray));

	}
}
