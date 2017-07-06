import java.util.*;

class QuickSort {
	public static void main(String[] args) {
		int intArray[] = new int[] { 5, 90, 35, 45, 150, 3 };
		quickSort(intArray, 0, intArray.length - 1);
		for (int ele : intArray)
			System.out.print(ele + " ");
	}

	public static void quickSort(int[] A, int p, int r) {
		if (p < r) {
			//int q = partition(A, p, r);
			int q = randomizedPartition(A, p, r);
			quickSort(A, p, q - 1);
			quickSort(A, q + 1, r);
		}
	}

	static int partition(int[] A, int p, int r) {
		int x = A[r];
		int i = p - 1;
		int temp;
		for (int j = p; j < r; j++) {
			if (A[j] <= x) {
				i++;
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
			}
		}
		temp = A[i + 1];
		A[i + 1] = A[r];
		A[r] = temp;
		return i + 1;
	}

	static int randomizedPartition(int[] A, int p, int r) {
		Random rand = new Random();
		int ran = p + rand.nextInt(r - p + 1);

		int temp = A[ran];
		A[ran] = A[r];
		A[r] = temp;

		return partition(A, p, r);
	}
}
