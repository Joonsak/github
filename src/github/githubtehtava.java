package github;
import java.util.Scanner;
public class githubtehtava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String name = "Emma";
		String guess;
		System.out.println("Guess my name!");

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
	}while(!name.equals(guess));
	
	}

}
