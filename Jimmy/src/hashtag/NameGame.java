package hashtag;
import java.util.Scanner;

public class NameGame {

	public static void main(String[] args) {
		
		/* 8Scanner scan = new Scanner(System.in); 
		System.out.println("Enter imput");
		int seconds = scan.nextInt();
		int minutes = seconds/60;
		int remainder = seconds % 60;
		
		System.out.println(minutes + " minutes " + remainder + " seconds");
		
		scan.close();*/
		
		System.out.println("Please enter your name: ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		
		String s1 = "Jimmy";
		String s2 = "Jim";
		String s3 = "James";
		
		if (name.equalsIgnoreCase(s1)) 
			System.out.println("Fuck off");	
		else if (name.equalsIgnoreCase(s2)) 
			System.out.println("Fuck off");	
		else if (name.equalsIgnoreCase(s3)) 
			System.out.println("Fuck off");	
			else 
				System.out.println("Hi!!");
	}

}
