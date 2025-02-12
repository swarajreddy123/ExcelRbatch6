import java.util.HashSet;

public class Demo073 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1};
        printDuplicates(array);
    }

    public static void printDuplicates(int[] array) {
        HashSet<Integer> uniqueElements = new HashSet<>();
        HashSet<Integer> duplicateElements = new HashSet<>();

        for (int num : array) {
            if (!uniqueElements.add(num)) {
                duplicateElements.add(num);
            }
        }

        if (duplicateElements.isEmpty()) {
            System.out.println("No duplicate elements found.");
        } else {
            System.out.println("Duplicate elements: " + duplicateElements);
        }
    }
}
