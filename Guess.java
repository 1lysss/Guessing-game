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
        int count = 0;
        Guess user = new Guess();
        
        int random = generated_num(); 
        int guess = -1;
        
        while (guess != random)
        {
            System.out.print("Guess the number: ");
            if (user.scanner.hasNextInt())
            {
                count++;
                guess = user.scanner.nextInt();
                
                if (guess > random) System.out.println("Lower!");
                else if (guess < random) System.out.println("Higher!");
            }
            else
            {
                System.out.println("Bad input! ");
                user.scanner.next();
            }
        }

        System.out.printf("Good guess! It was indeed: %d, guessed in %d attempts!\n", random, count);
    }
}

