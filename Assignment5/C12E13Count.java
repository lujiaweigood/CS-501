import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class C12E13Count {
		
	public static void main(String[] args){
		int option=JOptionPane.YES_OPTION;
		while(option == JOptionPane.YES_OPTION){
			String fileName=JOptionPane.showInputDialog(
				"<html>This program will count the number of characters, words, and lines in txt file."
								+"<br><br>Enter a txt file name without (.txt)");
								
			if (fileName != null){
				BufferedReader reader = null;		 
				int charCount = 0;			 
				int wordCount = 0;			 
				int lineCount = 0;
			try{
				reader = new BufferedReader(new FileReader(fileName + ".txt"));
				String currentLine = reader.readLine();
				while (currentLine != null)
            {
                lineCount++;
                String[] words = currentLine.split(" ");      
                wordCount = wordCount + words.length;
                for (String word : words)
                {  
                    charCount = charCount + word.length();
                }
                currentLine = reader.readLine();
			}
			JOptionPane.showMessageDialog(null, "Number Of Chars In A File : "+charCount + "\nNumber Of Words In A File : "+wordCount + "\nNumber Of Lines In A File : "+lineCount);
				} // end try
			catch(Exception ex){
				String outputStr = ex.getMessage() + 
						"\nDo you want to continue? ";
				option = JOptionPane.showConfirmDialog(null, outputStr);
			} // end catch
		}else {
			option = JOptionPane.NO_OPTION;
		}
	} // end while
} // end main()

}
