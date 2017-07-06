class SelectionSort {

	public static void main(String[] args) {
		int intArray[] = new int[] { 5, 90, 35, 45, 150, 3 };
		selectionSort(intArray);
		for (int ele : intArray)
			System.out.print(ele + " ");
	}

	public static void selectionSort(int[] A) {
		int n = A.length;
		int i, j, temp;
		for (j = 0; j < n - 1; j++) {
			int iMin = j;
			for (i = j + 1; i < n; i++) {
				if (A[i] < A[iMin]) {
					iMin = i;
				}
			}
			if (iMin != j) {
				temp = A[j];
				A[j] = A[iMin];
				A[iMin] = temp;
			}
		}
	}
}