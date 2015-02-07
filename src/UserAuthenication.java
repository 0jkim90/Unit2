import java.util.Scanner;

public class UserAuthenication {
	private static String correctUsername = "young";
	private static String correctPassword = "1234";
	private static String username;
	private static String password;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username");
		username = sc.next();
		System.out.println("Enter Password");
		password = sc.next();
		boolean check = authentication(username, password);
		if (check == true)
			System.out.println("Welcome "+username);
		else System.out.println("Invalid Username or Password");
				
	}
	public static boolean authentication(String username, String password) {
	boolean status = false;
		if ((username.equalsIgnoreCase(correctUsername))&&(password.equals(correctPassword)))
			status = true;
		else
			status = false;
		return status;
	}			

}

