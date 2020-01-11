public class Solution345 {
    public String reverseVowels(String s) {
        char[] res=s.toCharArray();
        int i=0,j=res.length-1;
        while(i<j){
            while(i<j && !isVowels(res[i]))    i++;
            while(i<j && !isVowels(res[j]))    j--;
            swap(res,i++,j--);
        }
        return String.valueOf(res);
    }
    private boolean isVowels(char c){
        switch (c){
            case'a':
            case'e':
            case'i':
            case'o':
            case'u':
            case'A':
            case'E':
            case'I':
            case'O':
            case'U':
                return true;
            default:
                return false;
        }
    }
    private void swap(char[] res,int i,int j){
        char temp=res[i];
        res[i]=res[j];
        res[j]=temp;
    }
}
