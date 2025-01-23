class ListNode {
    int val;
    ListNode next;
    
    ListNode() {}
    
    ListNode(int val) { 
        this.val = val; 
    }
    
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}

public class LTCode004 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
        }
        
        return dummyHead.next;
    }

    private static ListNode createList(int[] nums) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummyHead.next;
    }

    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LTCode004 solution = new LTCode004();
        
        int[] arr1 = {2, 4, 3};
        int[] arr2 = {5, 6, 4};
        ListNode l1 = createList(arr1);
        ListNode l2 = createList(arr2);
        ListNode result = solution.addTwoNumbers(l1, l2);
        printList(result);

        int[] arr3 = {9, 9, 9, 9, 9, 9, 9};
        int[] arr4 = {9, 9, 9, 9};
        ListNode l3 = createList(arr3);
        ListNode l4 = createList(arr4);
        result = solution.addTwoNumbers(l3, l4);
        printList(result);

        int[] arr5 = {0};
        int[] arr6 = {0};
        ListNode l5 = createList(arr5);
        ListNode l6 = createList(arr6);
        result = solution.addTwoNumbers(l5, l6);
        printList(result);
    }
}
