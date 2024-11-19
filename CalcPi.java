public class CalcPi {
    public static void main(String[] args) {

        int input = Integer.parseInt(args[0]);
        if (input < 0) {
            System.out.println("Please enter correct number.");
            return;
        }


        if (args.length != 1) {
            System.out.println("Usage: java CalcPi <number_of_terms>");
            return;
        }

     
        double piApproximation = 0.0;
        for (int i = 0; i < input; i++) {
            piApproximation += Math.pow(-1, i) / (2 * i + 1);
        }
        piApproximation *= 4;

        // Print the results
        System.out.printf("pi according to Java: %.16f%n", Math.PI);
        System.out.printf("pi, approximated:     %.16f%n", piApproximation);
    }
}
