public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int lengthOfLastWord(final String A) {
      int i,n;
      StringBuilder str = new StringBuilder();
      String[] st = A.split(" ");
      n=st.length;
      if(n==0)
      return 0;
      str.append(st[n-1]);
      return str.length();
    }
}
