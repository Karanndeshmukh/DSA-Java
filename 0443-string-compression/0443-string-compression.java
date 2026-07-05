class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int k = 0;
        while (i < chars.length) {
            int j = i;
            while (j < chars.length && chars[i] == chars[j]) {
                j++;
            }
            
            chars[k] = chars[i];
            k++;
            int count = j - i;
           
            if (count > 1) {
                String str = Integer.toString(count);
                for (int x = 0; x < str.length(); x++) {
                    chars[k] = str.charAt(x);
                    k++;
                }
            }
            i = j;
        }
        return k;
    }
}