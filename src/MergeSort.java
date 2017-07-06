import java.util.*;

public class MergeSort {

	public static void main(String[] args) {
		int inputArray[] = new int[] { 5, 90, 35, 45, 150, 3 };
		mergeSort(inputArray);
		for (int ele : inputArray)
			System.out.print(ele + " ");
	}

	static void mergeSort(int[] A) {
		if (A.length > 1) {
			int q = A.length / 2;

			int[] leftArray = Arrays.copyOfRange(A, 0, q);
			int[] rightArray = Arrays.copyOfRange(A, q, A.length);

			mergeSort(leftArray);
			mergeSort(rightArray);
			merge(A, leftArray, rightArray);
		}
	}

	static void merge(int[] a, int[] l, int[] r) {
		int n = a.length;
		int i, li, ri;
		i = li = ri = 0;
		while (i < n) {
			if ((li < l.length) && (ri < r.length)) {
				if (l[li] < r[ri]) {
					a[i] = l[li];
					i++;
					li++;
				} else {
					a[i] = r[ri];
					i++;
					ri++;
				}
			} else {
				if (li >= l.length) {
					while (ri < r.length) {
						a[i] = r[ri];
						i++;
						ri++;
					}
				}
				if (ri >= r.length) {
					while (li < l.length) {
						a[i] = l[li];
						li++;
						i++;
					}
				}
			}
		}
	}
}