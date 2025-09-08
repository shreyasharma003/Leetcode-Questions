public class PalindromeNumber {
        public boolean isPalindrome(int x) {
        int target = x;
        int sum = 0;

        while(x>0){
            int mod = x%10;
            x = x/10;
            sum = sum*10 + mod;
        }
        return sum==target;
    }
}
