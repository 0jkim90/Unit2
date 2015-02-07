import javax.swing.JOptionPane;
	
public class UserAuthJOption {
	private static String correctUsername = "young";
	private static String correctPassword = "1234";
	private static String username;
	private static String password;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		username = JOptionPane.showInputDialog("Enter Username");
		password = JOptionPane.showInputDialog("Enter Password");
		boolean check = UserAuthenication.authentication(username, password);		
		if (check == true)
			JOptionPane.showMessageDialog(null, "Welcome " + username);
		else
			JOptionPane.showMessageDialog(null, "Invalid Username or Password");

	}

}
