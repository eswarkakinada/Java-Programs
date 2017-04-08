package exception;

public class E1 {

	public static class CheckPalindrome {
	    boolean isPalindrome(String input) {
	        int stringLength = input.length();
	        int indexLastElement = stringLength -1;
	        for (int i = 0; i < stringLength / 2; i++) {
	            if (input.charAt(i) != input.charAt(indexLastElement - i)) {
	                return false;
	            }
	        }
	        return true;
	    }
	 
	    public static void main(String[] args) {
	        CheckPalindrome checkPalindrom = new CheckPalindrome();
	        System.out.println("eee is plaindrome : " +checkPalindrom.isPalindrome("sir"));
	        System.out.println("running is palindrome : "+checkPalindrom.isPalindrome("running"));
	    }
	}

}
