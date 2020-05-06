import java.util.*;

public class Solution {
        public static String multiply(String a, String b) {
        int i,j,n,m,mod,carry;
        String a1 = new StringBuilder(a).reverse().toString();
        String b1 = new StringBuilder(b).reverse().toString();
        n=a1.length();
        m=b1.length();
        int[] arr = new int[n+m];
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                arr[i+j] += (a1.charAt(i)-'0') * (b1.charAt(j)-'0');
            }
        }
        StringBuilder str = new StringBuilder();
        for(i=0;i<arr.length;i++)
        {
            mod = arr[i]%10;
            carry = arr[i]/10;
            if(i+1 < arr.length)
            arr[i+1] = arr[i]+carry;
            str.insert(0,mod);
        }
        while(str.charAt(0)=='0' && str.length() > 1)
        str.deleteCharAt(0);
        return str.toString();
    }
}
