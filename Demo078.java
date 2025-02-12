public class Demo078 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3};
        int[] result = new int[arr.length];
        int left = 0, right = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[left++] = arr[i];
            } else {
                result[right--] = arr[i];
            }
        }

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}