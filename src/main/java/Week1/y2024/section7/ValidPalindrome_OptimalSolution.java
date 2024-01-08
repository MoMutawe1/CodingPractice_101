package Week1.y2024.section7;

public class ValidPalindrome_OptimalSolution {

    public static void main(String[] args) {
        //String str = "A man, a plan, a canal: Panama";
        String str = "0P";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        int a = 0; // left to right pointer
        int z = str.length() - 1; // right to left pointer

        while(a < z){
            if(!Character.isLetterOrDigit(str.charAt(a))) {a++; continue;}
            if(!Character.isLetterOrDigit(str.charAt(z))) {z--; continue;}
            if(Character.toUpperCase(str.charAt(a)) != Character.toUpperCase(str.charAt(z)))
                return false;
            a++;
            z--;
        }
        return true;
    }
}
