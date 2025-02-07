public class Demo069 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30, 35};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Sum of all elements in the array: " + sum);
    }
}