public class Demo080 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3};
        printArray(arr);

        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;

        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}