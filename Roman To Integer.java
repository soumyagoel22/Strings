public class Solution {
    public int romanToInt(String a) {
       int i,n,b;
       n=a.length();
       i=n-2;
       b=rom(a.charAt(i+1));
       if(n==0)
       return 0;
       while(i>=0)
       {
           if(rom(a.charAt(i))<rom(a.charAt(i+1)))
           b=b-rom(a.charAt(i));
           else
           b=b+rom(a.charAt(i));
           i--;
       }
       return b;
    }
    
    public static int rom(char c)
    {
        if(c=='I')
        return 1;
        else if(c=='V')
        return 5;
        else if(c=='X')
        return 10;
        else if(c=='L')
        return 50;
        else if(c=='C')
        return 100;
        else if(c=='D')
        return 500;
        else if(c=='M')
        return 1000;
        return 0;
    }
}
