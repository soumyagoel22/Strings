public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int atoi(final String A) {
       A.trim();
       int i,n,sign;
       n=A.length();
       i=0;
       sign=1;
       double res=0;
       if(A.charAt(i)=='-')
       {
           sign=-1;
           i++;
       }
       else if(A.charAt(i)=='+')
       {
           i++;
       }
       while(i<n)
       {
           if(Character.isDigit(A.charAt(i)))
           {
               res = res*10 + A.charAt(i)-'0';
               i++;
           }
           else
           break;
       }
       res = res*sign;
       if(res>Integer.MAX_VALUE)
       return Integer.MAX_VALUE;
       else if(res<Integer.MIN_VALUE)
       return Integer.MIN_VALUE;
       else
       return (int)res;
    }
}
