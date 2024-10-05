public class LexicographicallyFirstPalindrome {
    
    // Function to return the lexicographically smallest palindrome
    public static String smallestPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int n = charArray.length;

        // Iterate over the string from both ends towards the center
        for (int i = 0; i < n / 2; i++) {
            // Replace the character at the right end with the left if it's smaller
            if (charArray[i] != charArray[n - i - 1]) {
                charArray[n - i - 1] = charArray[i] = (char) Math.min(charArray[i], charArray[n - i - 1]);
            }
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String s = "ahgaghbggb"; // Example input

        // Find and print the lexicographically smallest palindrome
        System.out.println("Lexicographically first palindrome: " + smallestPalindrome(s));
    }
}
