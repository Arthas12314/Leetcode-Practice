public class Solution344 {
    public void reverseString(char[] s) {
        for(int i=0,j=s.length-1;i<s.length/2;i++,j--){
            swap(s,i,j);
        }
        /*int n = s.length;
        for (int i = 0; i < n / 2; ++i) {
            int j = n - 1 - i;
            s[i] ^= s[j];
            s[j] ^= s[i];
            s[i] ^= s[j];
        }*/
    }
    private void swap(char[] s,int i,int j){
        char temp=s[i];
        s[i]=s[j];
        s[j]=temp;
    }
}
