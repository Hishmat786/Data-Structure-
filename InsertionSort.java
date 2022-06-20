class InsertionSort {

    void insertSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        InsertionSort obj = new InsertionSort();
        int[] arr = { 8, 6, 4, 2, 9, 1 };
        System.out.print("Before: ");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        obj.insertSort(arr);

        System.out.print("\nAfter: ");
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");

    }
}