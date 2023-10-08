package github;
import java.util.Scanner;
public class githubtehtava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String name = "Emma";
		String guess;
		System.out.println("Guess my name!");
		int tries = 0;

	do
	{
		guess = in.nextLine();
		if(name.equals(guess)) {
			System.out.println("Congratulations you guessed right.");
			break;
		}
		if(guess.equals("loppu")) {
			break;
		}
		System.out.println("Guess again. (kirjoita: loppu, niin ohjelma sammuu.");
		tries++;
		if(name.length()>=tries) {
			System.out.println("Hint: "+ name.substring(0,tries));
		}else {
			System.out.println("Hint: "+name.substring(0, name.length()));
		}
	}while(!name.equals(guess));
	
	System.out.println("You guessed this many "+ tries+" times.");
	
	}	

}
