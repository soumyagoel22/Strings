import java.util.*;

public class Solution {
    public int compareVersion(String A, String B) {
        String[] a = A.split("\\.");
        String[] b = B.split("\\.");
        int i,j,n,m;
        n=a.length;
        m=b.length;
        double a1,b1;
        for(i=0,j=0;i<n && j<m;i++,j++)
        {
            a1 = Double.parseDouble(a[i]);
            b1 = Double.parseDouble(b[j]);
            if(a1>b1)
            return 1;
            else if(a1<b1)
            return -1;
        }
        while(i<n)
        {
            a1 = Double.parseDouble(a[i]);
            if(a1>0)
            return 1;
            i++;
        }
        while(j<m)
        {
            b1 = Double.parseDouble(b[j]);
            if(b1>0)
            return -1;
            j++;
        }
        return 0;
    }
}
