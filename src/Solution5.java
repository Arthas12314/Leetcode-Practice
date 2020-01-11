public class Solution5 {
    public String longestPalindrome(String s) {
        if(s.length()<1)
            return s;

        int l=0,r=0;
        int oddPos,evenPos,result;

        for(int i=0;i<s.length();i++){
            evenPos=expand(s,i,i+1);
            oddPos=expand(s,i,i);
            result=Math.max(evenPos,oddPos);
            if(result>r-l){
                l=i-(result-1)/2;
                r=i+result/2;
            }
        }
        return s.substring(l,r+1);
    }

    private int expand(String s,int l,int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
    //废弃的暴力解法
    /*private boolean isPalindrome(String s){
        if(s.length()<2)
            return true;
        int l=0,r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;r--;
        }
        return true;
    }*/
    //测试
    public static void main(String[] args) {
        Solution5 t=new Solution5();
        System.out.println(t.longestPalindrome("cbbd"));
    }
}
