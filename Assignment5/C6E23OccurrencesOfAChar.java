import java.awt.Component;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class C6E23OccurrencesOfAChar
{ 

public static void main(String[] args){
			int option=JOptionPane.YES_OPTION;
			int option2=JOptionPane.YES_OPTION;

			String charactor;
			while(option == JOptionPane.YES_OPTION){
				String string=JOptionPane.showInputDialog(
					"<html> The program that finds the number of occurrences of a specified character in a string using"
									+"<br>Enter a string: ");
					if ( string != null){
						try{
									
					while (option2 == JOptionPane.YES_OPTION){
						charactor =JOptionPane.showInputDialog(
							"Your string is : "+string + 
							"\nEnter a charactor: ");
							if ( charactor  != null){
							try{
								if (charactor.length() == 1)
									{
									int occurance = count(string,charactor.charAt(0));
									JOptionPane.showMessageDialog(null, "Occurance : "+occurance);	
									
								}else {
									// throw exception
									throw new Exception("Enter only one charcter");
								} 
							}catch(Exception e){
								
								JOptionPane.showMessageDialog(null, e.getMessage(), "Message for user", JOptionPane.WARNING_MESSAGE);
							} 
						}else {
								option2 = JOptionPane.NO_OPTION;
							} 
						}
					} catch(Exception e){
								
						JOptionPane.showMessageDialog(null, e.getMessage(), "Message for user", JOptionPane.WARNING_MESSAGE);
					}
				}
					else {
						option = JOptionPane.NO_OPTION;
						}										
					}
				}

	public static int count(String str, char a) 
	{ 
		int count = 0;
		
		for (int i = 0; i < str.length(); i++) 
		{ 
			if (str.charAt(i) == a) 
			{ 
				count++; 
			} 
		} 
		return count; 
	} 

}
