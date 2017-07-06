class InsertionSort {

	public static void main(String[] args) {
		int intArray[] = new int[] { 5, 90, 35, 45, 150, 3 };
		insertionSort(intArray);
		for (int ele : intArray)
			System.out.print(ele + " ");
	}

	public static void insertionSort(int[] A) {
		for (int j = 1; j < A.length; j++) {
			int key = A[j];
			int i = j - 1;
			while (i >= 0 && A[i] > key) {
				A[i + 1] = A[i];
				i--;
			}
			A[i + 1] = key;
		}
	}
}
