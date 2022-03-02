import java.util.Scanner;

public class C3E27Geometry
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int  repeatInt = 1;
        double x3;
        double y3;

        String intro = "Compute if a point is in right triangle";
        String ask = "Enter two numbers for a point’s x- and y-coordinates in a single line separated by spaces:";
        System.out.println(intro );
        System.out.println(ask);
        System.out.println("---------------------------------------------------------------");
        while (repeatInt ==1){
            // beginning of the code lines responding to the exercise

            x3 = input.nextDouble();
            y3 = input.nextDouble();
            if (x3 <0 || y3 <0){
                System.out.println("The point is not in the triangle");
                System.out.println("Repeat program (enter 1 for repeat 0 for quit)");
                repeatInt = input.nextInt ();

            }
            double result = ((0 - 200)*(y3 - 0) - (100 - 0)*(x3 - 200));
            if (result >= 0){
                System.out.println("The point is in the triangle");
                System.out.println("Repeat program (enter 1 for repeat 0 for quit)");
                repeatInt = input.nextInt ();
            } else {
                System.out.println("The point is not in the triangle");
                System.out.println("Repeat program (enter 1 for repeat 0 for quit)");
                repeatInt = input.nextInt ();
            }
        }
    }
}