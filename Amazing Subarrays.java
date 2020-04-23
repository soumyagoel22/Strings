public class Solution {
    public int solve(String A) {
        int i,n,count,sum=0;
        n=A.length();
        A = A.toLowerCase();
        for(i=0;i<n;i++)
        {
            count=0;
            char ch = A.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                count = A.substring(i,n).length();
                sum=sum+count;
            }
            else
            {
                continue;
            }
        }
        return sum%10003;
    }
}
