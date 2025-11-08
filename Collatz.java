// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		
		int N = Integer.parseInt(args[0]);
		String mode = args[1];

		for (int seed = 1; seed <= N; seed++) {
            int current = seed;
            int steps = 1;
            
            // In verbose mode, print the sequence
            if (mode.equals("v")) {
                System.out.print(current + " ");
            }
            
            // Generate the hailstone sequence until we reach 1
            do {
                if (current % 2 == 0) {
                    // If even, divide by 2
                    current = current / 2;
                } else {
                    // If odd, multiply by 3 and add 1
                    current = (current * 3) + 1;
                }
                
                steps++;
                
                // In verbose mode, print each number in the sequence
                if (mode.equals("v")) {
                    System.out.print(current + " ");
                }
            } while (current != 1);
            
            // In verbose mode, print the number of steps
            if (mode.equals("v")) {
                System.out.println("(" + steps + ")");
            }
        }

		
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");

	}
}
