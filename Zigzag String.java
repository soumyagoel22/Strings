import java.util.*;

public class Solution {
    public String convert(String A, int B) {
        if (B<=1) return A;
        if(A.length()<=1) return A;
        StringBuilder s = new StringBuilder();
        for (int i=0; i<B; i++){
            int distIn = (B-i-1)*2;
            int distOut = i*2;
            int dist = distOut;
            for(int j=i; j<A.length(); j+=dist){
                System.out.print(A.charAt(j)+" "+A.length());
                s.append(A.charAt(j));
                dist = dist==distIn ? distOut : distIn;
                if(dist==0) dist = dist==distIn ? distOut : distIn;
            }
        }
        return s.toString();
    }
}
