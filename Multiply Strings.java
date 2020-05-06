import java.util.*;

public class Solution {
    // public String multiply(String A, String B) {
        public static String multiply(String a, String b) {
        // String n1 = new StringBuilder(a).reverse().toString();
        // String n2 = new StringBuilder(b).reverse().toString();
        
        // int[] d = new int[a.length() + b.length()];
        
        // for(int i =0; i < n1.length(); i++){
        //     for(int j =0; j < n2.length(); j++){
        //         d[i+j] += (n1.charAt(i) - '0') * (n2.charAt(j) - '0');
        //     }
        // }
        // StringBuilder sb = new StringBuilder();
        // for(int i = 0; i < d.length; i++){
        //     int mod = d[i] % 10;
        //     int carry = d[i] / 10;
        //     if(i + 1 < d.length) 
        //         d[i + 1] += carry;
        //     sb.insert(0, mod);
        // }
        
        // while(sb.charAt(0) == '0' && sb.length() > 1)
        //     sb.deleteCharAt(0);
        
        // return sb.toString();
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
