// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		
		int N = Integer.parseInt(args[0]);
        String mode = args[1];

        for (int seed = 1; seed <= N; seed++) {
            int current = seed;
            int steps = 1;

            if (mode.equals("v")) {
                System.out.print(current);
            }

            while (current != 1) {
                steps++;
                if (current % 2 == 0) {
                    current /= 2;
                } else {
                    current = 3 * current + 1;
                }

                if (mode.equals("v")) {
                    System.out.print(" " + current);
                }
            }

            if (mode.equals("v")) {
                steps++; // include the initial number
                System.out.println(" (" + steps + ")");
            }
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
