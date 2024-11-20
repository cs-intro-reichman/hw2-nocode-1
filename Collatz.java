    public class Collatz {
        public static void main(String[] args) {
            int input = Integer.parseInt(args[0]);
            String mode = args[1];
    
            for (int seed = 1; seed <= input; seed++) {
                int steps = 0;
                int current = seed;
                StringBuilder sequence = new StringBuilder();
    
                while (current != 1) {
                    sequence.append(current).append(" ");
                    if (current % 2 == 0) {
                        current /= 2;
                    } else {
                        current = current * 3 + 1;
                    }
                    steps++;
                }
                sequence.append("1 (").append(steps + 1).append(")");
    
                if (mode.equals("v")) {
                    System.out.println(sequence.toString());
                }
            }
    
            System.out.println("Every one of the first " + input + " hailstone sequences reached 1.");
        }
    }
