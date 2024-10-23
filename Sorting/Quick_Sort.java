public class QuickSort {

    // Method to partition the array on the basis of pivot element
    static int partition(int array[], int low, int high) {
        // Choose the rightmost element as pivot
        int pivot = array[high];

        // Pointer for the greater element
        int i = (low - 1);

        // Traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                // Swap elements at i and j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // Swap the pivot element with the greater element at i+1
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // Return the partition point
        return (i + 1);
    }

    // Method to perform quicksort
    static void quickSort(int array[], int low, int high) {
        if (low < high) {
            // Find the pivot element
            int pivotIndex = partition(array, low, high);

            // Recursively sort elements before and after partition
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    public static void main(String args[]) {
        int[] data = { 8, 7, 6, 1, 0, 9, 2 };
        System.out.println("Unsorted Array:");
        printArray(data);

        // Perform quicksort on the array
        int size = data.length;
        quickSort(data, 0, size - 1);

        System.out.println("Sorted Array in Ascending Order:");
        printArray(data);
    }

    // Helper function to print the array
    static void printArray(int array[]) {
        int n = array.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
