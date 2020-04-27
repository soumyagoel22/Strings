public class Solution {
    public String reverseWords(String a) {
         String[] s = a.split(" ");
         int i,n;
         n=s.length;
         StringBuilder str = new StringBuilder();
         for(i=n-1;i>0;i--)
         {
             str.append(s[i]).append(" ");
         }
         str.append(s[0]);
         return str.toString();
    }
}
