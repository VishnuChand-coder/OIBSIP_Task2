import java.util.*;
public class OasisGame
{
	public static void main(String[] args) {
		int maxNoOfAttempts=10, score=100;
		System.out.println("\t\t\t\t***--   WELCOME TO NUMBER GUESSING GAME   --***\t\t\t\t");
		Random ran = new Random();
		int n = ran.nextInt(100);
		Scanner sc = new Scanner(System.in);
		int num;
		while(true) {
			if(maxNoOfAttempts>0) {
				System.out.println("\nNumber of Attempts left: " + maxNoOfAttempts);
				System.out.println("Guess the number between 1 to 100 (Maximum number of Attempts is 10): ");
				num = sc.nextInt();
				maxNoOfAttempts--;
				if(num==n) {
					System.out.println("\n\t\t\tHurray!..You guessed the number in " + (10-maxNoOfAttempts) + " Attempts");
					System.out.println("\t\t\tYour Score: " + score + "/100");
					break;
				} else if(num<n) {
					System.out.println("The number you entered is less than the number to be guessed");
					score -=10;
				} else {
					System.out.println("The number you entered is greater than the number to be guessed");
					score -=10;
				}
			} else {
				System.out.println("\n\t\t\tWell Tried..buddy! Better luck next time!\n\t\t ****--You Lost the Game--***");
				System.out.println("\t\t\t\tYour Score: 0/100");
				break;
			}
		}
	}
}