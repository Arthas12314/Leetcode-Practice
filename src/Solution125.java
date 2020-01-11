public class Solution125 {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0,j=s.length()-1;
        while(i<j){
            while(!(Character.isAlphabetic(s.charAt(i))||Character.isDigit(s.charAt(i)))){
                i++;
            }
            while(i<j && !(Character.isAlphabetic(s.charAt(j))||Character.isDigit(s.charAt(j))))
                j--;
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}
