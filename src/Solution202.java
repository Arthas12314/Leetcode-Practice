public class Solution202 {
    public boolean isHappy(int n) {
        int temp=0;
        if(n==1)
            return true;
        if(n>1 && n<5)
            return false;
        for(int i=n;i>0;i/=10){
            temp+=Math.pow(i%10,2);
        }
        return isHappy(temp);
    }

    public static void main(String[] args) {
        Solution202 t=new Solution202();
        System.out.println(t.isHappy(Integer.MAX_VALUE));
    }
}
