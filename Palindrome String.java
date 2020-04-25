import java.util.*;

public class Solution {
    public int isPalindrome(String A) {
        A = A.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(A);
        A = A.toLowerCase();
        System.out.println(A);
        int i,n,j;
        n=A.length();
        i=0;
        j=n-1;
        while(i<=j)
        {
            if(A.charAt(i)!=A.charAt(j))
            return 0;
            else
            {
                i++;
                j--;
                continue;
            }
        }
        return 1;
    }
}
