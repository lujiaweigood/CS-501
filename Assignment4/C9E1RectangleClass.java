import java.util.Scanner;

public class C9E1RectangleClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int repeat = 1;				
		Rectangle rect = new Rectangle();

		double width = 0;
		double height = 0;
		boolean continueInputFristElement = true;
		boolean continueInputSecondElement = true;


		System.out.println("The following program allows you to test the Rectangle");
		System.out.println("You will enter values for width and height and see the perimeter and area of the Rectangle");
		

		System.out.println("Initial width and height " + rect.toString());
		System.out.println();
		

		while(repeat != 0)
		{

			do{
			try{
			System.out.print("\nEnter the width: ");

				System.out.println("Invalid double, input again:");


			width = input.nextDouble();
			System.out.print("Enter the height: ");
			continueInputFristElement = false;
			} catch (java.util.InputMismatchException ex){
				System.out.println("Invalid double, input again:");
				input.nextLine();
			}
		}while (continueInputFristElement );

		do{
			try{
			height = input.nextDouble();
			continueInputSecondElement = false;
		} catch (java.util.InputMismatchException ex){
			System.out.println("Invalid double, input again:");
			input.nextLine();
		}
	}while (continueInputSecondElement);
			try {
				rect = new Rectangle(width,height);

				rect.print();
				System.out.println("\nEnter 0 to exit; any other integer to test another Rectangle");
				repeat = input.nextInt();
			}
			catch(Exception e) {
				System.out.println("Rectangl constructor threw" +
				" Exception w/ message: " + e.getMessage());

			}
		}
		input.close();
		Rectangle rectcopy = null;
		try{
		     rectcopy = new Rectangle(
				rect.getWidth(),
				rect.getHeight());

		}

		catch(Exception e) {

			System.out.println (" threw Exception w/ message = " + e.getMessage());
		}

		if(rectcopy.equals(rect))
		System.out.println(".equals() test passed");
	else System.out.println(".equals test failed");



		try{
			rect = new Rectangle(width,height);
			rect.setWidth(4);

			System.out.println(" - passed");
		} 
		catch(Exception e) {

			System.out.println(" - failed" +
			rect.getErrorMessage());
		}

		try{
			rect.setWidth(4);
			System.out.println(" - passed");
		} 
		catch(Exception e) {
			System.out.println(" - failed" + rect.getErrorMessage());
		}

		if(!rectcopy.equals(4))
		System.out.println("!.equals() test passed");
	else System.out.println("!.equals test failed");
	rect.print();


		try{
			rect.setHeight(40);
			System.out.println(" - passed");
		} 
		catch(Exception e) {
			System.out.println(" - failed" + rect.getErrorMessage());
		}

		if(!rectcopy.equals(40))
		System.out.println("!.equals() test passed");
	else System.out.println("!.equals test failed");
	rect.print();



		try{
			rect.setWidth(3.5);

			System.out.println(" - passed");
		} 
		catch(Exception e) {

			System.out.println(" - failed" +
			rect.getErrorMessage());
		}

		if(!rectcopy.equals(3.5))
		System.out.println("!.equals() test passed");
	else System.out.println("!.equals test failed");
	rect.print();


		try{
			rect.setHeight(35.9);
			System.out.println(" - passed");
		} 
		catch(Exception e) {
			System.out.println(" - failed" + rect.getErrorMessage());
		}
		if(!rectcopy.equals(35.9))
		System.out.println("!.equals() test passed");
	else System.out.println("!.equals test failed");
	rect.print();

	}

}
