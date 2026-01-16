public class OptimizedInsertionSort {

    static void insertionSort(int[] arr) {
        int n = arr.length;
        boolean sorted;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            sorted = true;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                sorted = false;
            }
            arr[j + 1] = key;

            if (sorted)
                break;
        }
    }

    static void display(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Before Sorting:");
        display(arr);

        insertionSort(arr);

        System.out.println("After Sorting:");
        display(arr);
    }
}
