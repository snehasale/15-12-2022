import java.util.Scanner;

public class GuessThePin{
	public static void main(String[] args){
		
		final int pin=13;
		int guessPin;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i<=3; i++){
			System.out.println("Guess the pin: ");
			guessPin = sc.nextInt();
			
			if (guessPin == pin){
				System.out.println("Correct, welcome back.");
				break;
			}
			else{
				count++;
				if(count >= 3){
					System.out.println("Sorry but you have been locked out.");
					break;
				}				
			
				System.out.println("Incorrect, try again.");
				
				
			}
			
		}
		

	
	
	}
}