import java.util.Scanner;

public class Demo007 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter your mobile number: ");
        String mobileNumber = scanner.nextLine();
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNumber);
        scanner.close();
    }
}
