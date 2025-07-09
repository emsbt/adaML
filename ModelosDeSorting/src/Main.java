import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 7};

        System.out.println("Original:");
        SortingNumber.printArray(numbers);

        // Bubble Sort
        int[] arr1 = numbers.clone();
        SortingNumber.bubbleSort(arr1);
        System.out.println("Bubble Sort:");
        SortingNumber.printArray(arr1);

        // Selection Sort
        int[] arr2 = numbers.clone();
        SortingNumber.selectionSort(arr2);
        System.out.println("Selection Sort:");
        SortingNumber.printArray(arr2);

        // Insertion Sort
        int[] arr3 = numbers.clone();
        SortingNumber.insertionSort(arr3);
        System.out.println("Insertion Sort:");
        SortingNumber.printArray(arr3);

        // Merge Sort
        int[] arr4 = numbers.clone();
        SortingNumber.mergeSort(arr4);
        System.out.println("Merge Sort:");
        SortingNumber.printArray(arr4);

        // Quick Sort
        int[] arr5 = numbers.clone();
        SortingNumber.quickSort(arr5);
        System.out.println("Quick Sort:");
        SortingNumber.printArray(arr5);

        // Heap Sort
        int[] arr6 = numbers.clone();
        SortingNumber.heapSort(arr6);
        System.out.println("Heap Sort:");
        SortingNumber.printArray(arr6);

        // Counting Sort (só para inteiros não-negativos)
        int[] arr7 = numbers.clone();
        SortingNumber.countingSort(arr7);
        System.out.println("Counting Sort:");
        SortingNumber.printArray(arr7);

        // Radix Sort (só para inteiros não-negativos)
        int[] arr8 = numbers.clone();
        SortingNumber.radixSort(arr8);
        System.out.println("Radix Sort:");
        SortingNumber.printArray(arr8);

        // Shell Sort
        int[] arr9 = numbers.clone();
        SortingNumber.shellSort(arr9);
        System.out.println("Shell Sort:");
        SortingNumber.printArray(arr9);

        String [] sorted = {"Emerson", "Alice", "Bob", "Charlie", "Diana", "Emaly", "Frank", "George", "Hannah", "Ian"};
        Arrays.sort(sorted);

        System.out.println("Arrays.sort:");
        SortingNumber.printArrayString(sorted);
    }
}