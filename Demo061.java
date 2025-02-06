public class Demo061 {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 10 are:");

        // Loop through numbers from 1 to 10
        for (int num = 2; num <= 10; num++) {
            boolean isPrime = true;

            // Check if the number is divisible by any number from 2 to num/2
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If the number is prime, print it
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
