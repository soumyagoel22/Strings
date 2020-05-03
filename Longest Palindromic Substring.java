import java.util.*;

public class Solution {

    private int start,end,maxlength;
    
    private void check(String a,int left,int right)
    {
        while(left>=0 && right<a.length() && a.charAt(left)==a.charAt(right))
        {
            if(right-left+1>maxlength)
            {
                start=left;
                end = right+1;
                maxlength = right-left+1;
            }
            left--;
            right++;
        }
    }

    public String longestPalindrome(String A) {
        start=0;
        end=0;
        maxlength=0;
        for(int i=0;i<A.length();i++)
        {
            check(A,i,i);
            check(A,i,i+1);
        }
        return A.substring(start,end);
    }
}
