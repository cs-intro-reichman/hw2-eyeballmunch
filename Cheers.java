public class Cheers {
        public static void main(String[] args) {

                //i really have no idea wht the indentaion is 2 tabs its driving me crazzzyyyyy 

                //collecting user input and converting to uppercase
	        String word = args[0].toUpperCase(); 
                int times = Integer.parseInt(args[1]);

                //my letters
                String anLetters = "AEFHILMNORSX";

                for (int i = 0; i < word.length(); i++) {
                        char ch = word.charAt(i);
                        String preFix = "a";

                        if (anLetters.indexOf(ch) != -1) {
                                preFix = "an";
                        }

                        System.out.println("Give me " + preFix + " " + ch + ": " + ch + "!");
                }

                // Print "What does that spell?" and repeat
                System.out.println("What does that spell?");

                for (int i = 0; i < times; i++) {
                        System.out.println(word + "!!!");
                }
        }
}
