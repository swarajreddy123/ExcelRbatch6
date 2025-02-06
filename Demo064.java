public class Demo064 {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        if (array.length > 1) {
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;

            System.out.println("Array after swapping first and last elements:");
            for (int num : array) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Array has less than 2 elements, cannot swap.");
        }
    }
}
