import java.util.HashSet;
import java.util.Set;

public class Solution929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> actualEmailSet = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            String[] split = emails[i].split("@");
            String userName = split[0];
            String hostName = split[1];
            int plusIndex = userName.indexOf('+');
            String realUserName =
                userName.substring(0, plusIndex != -1 ? userName.indexOf('+') : userName.length()).replace(".", "");
            actualEmailSet.add(realUserName + "@" + hostName);
        }
        return actualEmailSet.size();
    }
    
    public static void main(String[] args) {
        Solution929 solution929 = new Solution929();
        String[] emails = new String[] {"test.email+alex@leetcode.com", "test.email@leetcode.com"};
        System.out.println(solution929.numUniqueEmails(emails));
    }
}
