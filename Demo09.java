public class Demo09 {
    public static void acceptDetails(String customerName, String accountNumber, double balance) {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Total Balance: " + balance);
    }
    public static void displayDetails() {
        String customerName = "raju";
        String accountNumber = "54747558885";
        double balance = 10000.0;
        acceptDetails(customerName, accountNumber, balance);
    }
    public static void main(String[] args) {
        displayDetails();
    }
}
