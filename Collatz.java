public class Collatz {
    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]); // Number of sequences to compute
        String mode = args[1]; // Mode ("v" for verbose)

        for (int seed = 1; seed <= input; seed++) {
            int steps = 0;
            int current = seed;
            StringBuilder sequence = new StringBuilder();

            // Compute the Collatz sequence for all seeds
            do {
                sequence.append(current).append(" ");
                if (current % 2 == 0) {
                    current /= 2;
                } else {
                    current = current * 3 + 1;
                }
                steps++;
            } while (current != 1);

            // Append the final "1" and total steps
            sequence.append("1 (").append(steps + 1).append(")");

            // Print sequence if mode is verbose
            if (mode.equals("v")) {
                System.out.println(sequence.toString());
            }
        }

        // Print summary message
        System.out.println("Every one of the first " + input + " hailstone sequences reached 1.");
    }
}


