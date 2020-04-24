public class Solution {
    public String longestCommonPrefix(ArrayList<String> A) {
    //   int i,n,minlen;
    //   n=A.size();
    //   if(n==0)
    //   {
    //       return "";
    //   }
    //   minlen=Integer.MAX_VALUE;
    //   for(String s : A)
    //   {
    //       minlen=Math.min(minlen,s.length());
    //   }
    //   StringBuilder str = new StringBuilder();
    //   for(i=0;i<minlen;i++)
    //   {
    //       char ch = A.get(0).charAt(i);
    //       for(String s1 : A)
    //       {
    //           if(s1.charAt(i)!=ch)
    //           {
    //               return str.toString();
    //           }
    //       }
    //       str.append(ch);
    //   }
    //   return str.toString();
    int i,n,minlen;
    n=A.size();
    if(n==0)
    return "";
    minlen=Integer.MAX_VALUE;
    for(String s:A)
    {
        minlen=Math.min(minlen,s.length());
    }
    StringBuilder str = new StringBuilder();
    for(i=0;i<minlen;i++)
    {
        char ch = A.get(0).charAt(i);
        for(String ab:A)
        {
            if(ab.charAt(i)!=ch)
            return str.toString();
        }
        str.append(ch);
    }
    return str.toString();
    }
}
