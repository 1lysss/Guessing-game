import java.util.Scanner;

public class Guess {
    
    public static final int RANGE = 20;
    static Scanner scanner = new Scanner(System.in);

    public static int generated_num()
    {
        int random = (int) (Math.random()*RANGE) + 1;
        return random;
    }

    public static int getInt()
    {
        int input;
        while(!scanner.hasNextInt())
        {
            System.out.print("Only accepts int, try again: ");
            scanner.next();
        }
        input = scanner.nextInt();

        return input;
    }

    public static void main(String[] args)
    {
        int count = 0;
        
        int random = generated_num(); 
        int guess = -1;
        
        System.out.print("Start guessing: ");
        while (guess != random)
        {
            guess = getInt();
         
            if (guess > random) { System.out.println("Lower!"); count++; }
            else if (guess < random) { System.out.println("Higher!"); count++; }
        }
            count++;
            System.out.printf("Good guess! It was indeed: %d, guessed in %d attempts!\n", random, count);
    }
}



