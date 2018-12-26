
public class IsPalindrome {
    public static void main(String[] args) {
        
    }
    
    
    public static boolean isPalindrome(String s){
        boolean palindrome = false;
        if(s.equalsIgnoreCase(new StringBuilder(s).reverse().toString())){
            palindrome = true;
        }
        return palindrome;
    }
}
