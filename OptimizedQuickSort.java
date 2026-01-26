public class OptimizedQuickSort {

    static int medianOfThree(int[] arr, int low, int high) {
        int mid = (low + high) / 2;

        if (arr[low] > arr[mid])
            swap(arr, low, mid);
        if (arr[low] > arr[high])
            swap(arr, low, high);
        if (arr[mid] > arr[high])
            swap(arr, mid, high);

        swap(arr, mid, high);
        return arr[high];
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = medianOfThree(arr, low, high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void display(int[] arr) {
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("Before Sorting:");
        display(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("After Sorting:");
        display(arr);
    }
}
