public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int strStr(final String A, final String B) {
        if(A.length()==0 || B.length()==0)
        return -1;
        int i,n,m;
        n=A.length();
        m=B.length();
        String s;
        for(i=0;i<=n-m;i++)
        {
            s = A.substring(i,m+i);
            if(s.equals(B))
            return i;
        }
        return -1;
    }
}
