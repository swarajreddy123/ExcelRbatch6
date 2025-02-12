public class Demo075 {
    public static void main(String[] args) {
        int[] numbers = {1,2,5,4,8}; 

        int max = numbers[0]; 
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; 
            }
        }

        System.out.println("Maximum number in the array: " + max);
    }
}