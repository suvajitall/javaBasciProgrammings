package Interview_questuons;

import java.util.Random;
import java.util.Scanner;

public class GenerateRandomeNumberBetweenRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input range from user
        System.out.print("Enter minimum value: ");
        int min = scanner.nextInt();

        System.out.print("Enter maximum value: ");
        int max = scanner.nextInt();

        Random random = new Random();
        int rnd = random.nextInt((max-min+1)+min);
        
        System.out.println("Random number is : "+rnd);
    }
}
