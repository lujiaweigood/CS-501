import javax.swing.JOptionPane;
public class C6E18CheckPassword {
		
	public static void main(String[] args){
		int option=JOptionPane.YES_OPTION;
		while(option == JOptionPane.YES_OPTION){
			String password=JOptionPane.showInputDialog(
				"<html>A password must be at least eight characters."
								+"<br>Must contain only letters and digits."
								+"<br>Must contain at least two digits."
								+"<br><br>Password : ");
			if (password != null){
			try{
				isValidPassword(password);
				option=JOptionPane.showConfirmDialog(null,
					"Valid Password"+"\nDo you want to continue");
				} // end try
			catch(Exception ex){
				String outputStr = " Invalid Password: " + 
						ex.getMessage() + 
						"\nDo you want to continue? ";
				option = JOptionPane.showConfirmDialog(null, outputStr);
			} // end catch
		}else {
			option = JOptionPane.NO_OPTION;
		}
	} // end while
} // end main()

	   private static void isValidPassword(String password)throws Exception{
		   // enter code to check password requirements
		   int count = 0;
		if(password.length() == 0){
			throw new Exception("Please enter password");
		}
		
		for (int i = 0; i < password.length(); i++) {
			if (!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i))) {
				throw new Exception("A password consists of only letters and digits.");
			}
		}
		
		if (password.length() < 8) 
		{
			throw new Exception("A password must have at least eight characters.");
		}
		
		for (int i = 0; i < password.length(); i++) {
			if ((Character.isDigit(password.charAt(i)))) {
				count = count + 1;
			}
		}
		
		if (count < 2) {
			throw new Exception("A password must contain at least two digits.");
		}
	   
	   }// end isValidPassword

} // end class PasswordBlank
