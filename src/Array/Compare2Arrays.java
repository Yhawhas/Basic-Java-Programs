package Array;

import java.util.Arrays;

public class Compare2Arrays {

	public void arraysEqualsOwnMethod(int[] a, int[] b) {
		boolean flag = true;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[i]) {
				flag = false;
			}
		}
		System.out.println("Array Equals Own Method");
		if (flag) {
			System.out.println("\tArrays are Equal");
		} else {
			System.out.println("Arrays are not Equal");
		}
	}

	public void arrayEquals(int[] a, int[] b) {
		System.out.println("Simple comparison");
		if (Arrays.equals(a, b)) {
			System.out.println("\tArrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}

	}

	public void arrayDeepEquals(int[] a, int[] b) {
		System.out.println("Deep Comparison");
		Object[] arr1 = { a };
		Object[] arr2 = { b };
		if (Arrays.deepEquals(arr1, arr2)) {
			System.out.println("\tArrays are Equal");
		} else {
			System.out.println("Arrays are not equal");
		}

	}

	public void innerArrayDeepEquals(int[] a, int[] b) {
		System.out.println("Inner Deep Comparison");
		Object[] arr1 = { a };
		Object[] arr2 = { b };
		Object[] innerArr1 = { arr1 };
		Object[] innerArr2 = { arr2 };
		if (Arrays.deepEquals(innerArr1, innerArr2)) {
			System.out.println("\tArrays are Equal");
		} else {
			System.out.println("Arrays are not Equal");
		}

	}

	public static void main(String args[]) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { 1, 2, 3, 4 };
		System.out.println("Array a: " + Arrays.toString(a));
		System.out.println("Array b: " + Arrays.toString(b));
		Compare2Arrays obj = new Compare2Arrays();
		obj.arrayEquals(a, b);
		obj.arrayDeepEquals(a, b);
		obj.innerArrayDeepEquals(a, b);
		obj.arraysEqualsOwnMethod(a, b);

	}
}
