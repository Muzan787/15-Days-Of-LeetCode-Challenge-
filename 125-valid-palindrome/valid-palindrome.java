class Solution {
    public boolean isPalindrome(String s) {
        for (int i = 0 ; i < s.length() ; i++)
        {
            if (!Character.isLetterOrDigit(s.charAt(i)))
            {
                s = s.replace(Character.toString(s.charAt(i)), "");
                i--;
            }
        }
        String r = new StringBuilder(s).reverse().toString();
        if (s.equalsIgnoreCase(r))
            return true;
        else
            return false;
    }
}