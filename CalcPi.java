// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code

		// number of terms
		int nTerms = Integer.parseInt(args[0]); 
        double sum = 0.0;

        // Compute the series
        for (int i = 0; i < nTerms; i++) {

            double term = 1.0 / (2 * i + 1); 

            if (i % 2 != 0) { // alternate signs
                term = -term;
            }
            sum += term;
        }

		// multiply by 4 to get pi
        double approxPi = sum * 4;
		

        // Print results
        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated:     " + approxPi);
	}
}
