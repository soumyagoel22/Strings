import java.math.BigInteger;
import java.lang.Math;
public class Solution {
    public int power(String A) {
            BigInteger ab = new BigInteger(A);
            if(ab.compareTo(BigInteger.ONE)==0 || ab.compareTo(BigInteger.ZERO)==0)
            return 0;
            int i;
            for(i=0;i<ab.bitLength()-1;i++)
            {
                if(ab.testBit(i))
                return 0;
            }
            return 1;
        }
}
