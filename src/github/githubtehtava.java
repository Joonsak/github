package github;
import java.util.Scanner;
public class githubtehtava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String name = "Emma";
		
		
		System.out.println("Guess my name!");
		String guess = in.nextLine();
		if(name.equals(guess)) {
			System.out.println("Congratulations you guessed right.");
		}
		
	}

}
