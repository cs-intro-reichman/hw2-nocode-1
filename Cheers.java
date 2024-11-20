public class Cheers {
    public static void main(String[] args) {
        String input = args[0];
        int number = Integer.parseInt(args[1]);

        String anCharacters = "AEFHILMNORSX";

        for (int i = 0; i < input.length(); i++) {
            char c = Character.toUpperCase(input.charAt(i)); 

            if (anCharacters.indexOf(c) >= 0) {
                System.out.println("Give me an " + c + ": " + c + "!");
            } else {
                System.out.println("Give me a  " + c + ": " + c + "!");
            }
        }

        System.out.println("What does that spell?");
        for (int j = 0; j < number; j++) {
            System.out.println(input.toUpperCase() + "!!!"); 
        }
    }
}

