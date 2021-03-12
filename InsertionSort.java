public class InsertionSort {

    // method to sort array using insertion sort
    private void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {// start with the second element of the array
            int key = arr[i];// current element of the array for testing
            int j = i - 1;// represents index of the array element right before the current elent
            while (j >= 0 && arr[j] > key) {// check elements of arr[0..i-1] that are greater than the key element
                arr[j + 1] = arr[j]; // while previous value is greater than the current one, move it to one
                                     // position ahead of its current position
                j = j - 1;// check for elements before the current j value
            }
            arr[j + 1] = key;// the current key value now gets to the position of the previous element
        }

    }

    // utility function to print array of size n
    private static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Driver method
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        InsertionSort obj = new InsertionSort();
        obj.sort(arr);
        printArray(arr);
    }

}