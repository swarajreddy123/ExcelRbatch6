class Solution {
    public int reverse(int x) {
        int result = 0;
        int sign = x < 0 ? -1 : 1; 
        x = Math.abs(x); 

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                return 0;
            }
            
            result = result * 10 + digit;
        }

        return result * sign; 
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        
        
        System.out.println(solution.reverse(123));        
        System.out.println(solution.reverse(-123));       
        System.out.println(solution.reverse(120));        
        System.out.println(solution.reverse(0));          
        System.out.println(solution.reverse(2147483647)); 
        System.out.println(solution.reverse(-2147483648));
    }
}