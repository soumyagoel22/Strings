import java.util.*;

public class Solution {
    public String addBinary(String A, String B) {
        int i,j,n1,n2,carry,num;
        i=A.length()-1;
        j=B.length()-1;
        carry=0;
        StringBuilder str = new StringBuilder();
        while(i>=0 || j>=0 || carry>0)
        {
            n1= (i>=0)?(A.charAt(i)-'0'):0;
            n2= (j>=0)?(B.charAt(i)-'0'):0;
            num=n1+n2+carry;
            str.insert(0,num%2);
            carry = num/2;
            i--;
            j--;
        }
        return str.toString();
    }
    }
