import java.util.Scanner;

public class Demo079 {
    public static void main(String[] args) {
        int[] arr = {12, 34, 45, 9, 8, 90, 3};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the element to search: ");
        int element = scanner.nextInt();

        boolean found = false;
        for (int num : arr) {
            if (num == element) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element found in the array.");
        } else {
            System.out.println("Element not found.");
        }
    }
}