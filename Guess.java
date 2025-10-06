import java.util.Scanner;

public class Guess {
    
    public static final int RANGE = 100;

    // this function is NOT STATIC on purpose
    Scanner scanner = new Scanner(System.in);

    public static int generated_num()
    {
        int random = (int) (Math.random()*RANGE) + 1;
        return random;
    }

    public static void main(String[] args)
    {
        Guess user = new Guess();
        
        // Make up a number and promt user
        int random = generated_num(); 
        System.out.print("Guess a number: ");
        int guess = user.scanner.nextInt();

        // Guess the number
        while (random != guess)
        {
            if (guess < random) System.out.println("Higher! try again: ");
            else if(guess > random) System.out.println("Lower! try again; ");
            guess = user.scanner.nextInt();
        }

        System.out.println("Good guess! It was indeed " + random);
    }
}
