public class Demo067 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25, 30, 35};

        System.out.println("Even elements in the array:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}