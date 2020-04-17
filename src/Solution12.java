/**
 * @author Arthas
 */
public class Solution12 {
    public String intToRoman(int num) {
        String[] map={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] nums={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder res=new StringBuilder();
        int i=0;
        while (i<13) {
            while (num >= nums[i]) {
                num-=nums[i];
                res.append(map[i]);
            }
            i++;
        }
        return res.toString();
    }

    public static void main(String[] args) {
        Solution12 t=new Solution12();
        System.out.println(t.intToRoman(1994));
    }
}
