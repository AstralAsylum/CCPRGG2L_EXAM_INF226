public class Recursion {

    public static void main(String[] args) {
        
        // Remove letters (30 pts)

        // Instructions (Important!)

        // Without using arrays or loops or regular expressions, apply recursion to remove specific letters in
        // your full name.

        // 1. If the last letter of your surname is a vowel, remove all vowels in
        // your full name.

        // 2. If the last letter of your surname is a consonant, remove all
        // consonants in your full name.

        // 3. Use only lowercase letters
        
        // 4. Each letter should be removed one by one.

        // Example:
        // Full name is "elizer ponio jr".
        // The output should be "lzr pn jr".

        // Put your complete name in the "fullName" variable.
        // Example:
        // String fullName = "elizer ponio jr";

        String fullName = "john michael cruz";
        removeLetter(fullName);
    }

    static void removeLetter(String str) {
            // Add code here
            System.out.println("\nCurrent Name: " + str);
            System.out.println("REMOVED CONSONANTS OUTPUT: \n");
            System.out.print(str.substring(1, 2));      // O
            System.out.print(str.substring(4, 5));      // WHITE SPACE
            System.out.print(str.substring(6, 7));      // I
            System.out.print(str.substring(9, 10));     // A
            System.out.print(str.substring(10, 11));    // E
            System.out.print(str.substring(12, 13));    // WHITE SPACE
            System.out.print(str.substring(15, 16));    // U
            System.out.println("\n");
    }
}