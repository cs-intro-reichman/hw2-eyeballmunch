public class Cheers {
    public static void main(String[] args) {

        // Get the word and convert to uppercase
        String word = args[0].toUpperCase();

        // Get the number of times to repeat
        int times = Integer.parseInt(args[1]);

        // Letters that use "an" instead of "a"
        String anLetters = "AEFHILMNORSX";

        // Loop through each letter and print "Give me a/an <letter>: <letter>!"
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            String article = "a";

            if (anLetters.indexOf(ch) != -1) {
                article = "an";
            }

            // Exactly one space between article and letter
            System.out.println("Give me " + article + " " + ch + ": " + ch + "!");
        }

        // Print "What does that spell?"
        System.out.println("What does that spell?");

        // Repeat the full word with exclamation marks
        for (int i = 0; i < times; i++) {
            System.out.println(word + "!!!");
        }
    }
}
