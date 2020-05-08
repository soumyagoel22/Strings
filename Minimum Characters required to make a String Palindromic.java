import java.util.*;

public class Solution {
    public int solve(String A) {
    int i,n,start,end,temp;
    n=A.length();
    start=0;
    end=n-1;
    temp=end;
    while(start<=temp)
    {
        if(A.charAt(start)==A.charAt(temp))
        {
            start++;
            temp--;
        }
        else
        {
            start=0;
            end--;
            temp=end;
        }
    }
    return (n-end-1);
    }
}
