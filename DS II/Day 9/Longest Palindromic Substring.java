class Solution {
  public static String longestPalindrome(String s) {
        int[] ans = new int[]{0, 0};
        for (int i = 0; i < s.length(); i++) {
            int a = i + 1, b = i - 1;
            
            while (true) {
                a--; b++;
                if (s.charAt(a) != s.charAt(b)) {a++; b--; break;}
                if (a == 0 || b == s.length() - 1) break;
            }
            if (b - a > ans[1] - ans[0]) {ans[0] = a; ans[1] = b;}
        }

        
        for (int i = 0; i < s.length() - 1; i++) {
            int a = i + 1, b = i;

            while (true) {
                a--; b++;
                if (s.charAt(a) != s.charAt(b)) {a++; b--; break;}
                if (a == 0 || b == s.length() - 1) break;
            }

            if (b - a > ans[1] - ans[0]) {ans[0] = a; ans[1] = b;}

        }
        return s.substring(ans[0], ans[1] + 1);
    }
}