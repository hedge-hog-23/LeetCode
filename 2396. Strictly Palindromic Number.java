class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n - 2; i++) {
            String baseConverted = baseconv(i, n);
            String reversed = palindrome(baseConverted);
            
            if (!baseConverted.equals(reversed)) {
                return false;
            }
        }
        return true;
    }

    public String palindrome(String result) {
        StringBuilder rev = new StringBuilder(); //faster than string
        for (int i = result.length() - 1; i >= 0; i--) {
            rev.append(result.charAt(i));
        }
        return rev.toString();
    }

    public String baseconv(int base, int number) {
        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int remainder = number % base;
            result.insert(0, remainder); //eq to result = remiander + result
            number /= base;
        }

        return result.toString();
    }
}
