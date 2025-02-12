public class Demo083 {
    public static void main(String[] args) {
        String str = "Elephant"; 
        char ch = Character.toLowerCase(str.charAt(0));
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("first'" + str.charAt(0) + "' is a vowel.");
        } else {
            System.out.println("first '" + str.charAt(0) + "' is a consonant.");
        }
    }
}
