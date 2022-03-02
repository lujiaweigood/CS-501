import java.util.Scanner;

public class C4E2GeometryGreatCircleDistance
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int  repeatInt = 1;
        double x1;
        double y1;
        double x2;
        double y2;

        String intro = "Compute the great circle distance  between two points on the surface of a sphere.";
        String ask = "Enter four numbers for point’s x- and y-coordinates in a single line separated by spaces:";
        System.out.println(intro);
        System.out.println(ask);
        System.out.println("---------------------------------------------------------------");
        while (repeatInt ==1){
            // beginning of the code lines responding to the exercise
            System.out.print("Enter two numbers for point 1 (latitude and longitude) in degrees: ");
            x1 = input.nextDouble();
            y1 = input.nextDouble();
            System.out.print("Enter  two numbers for point 2 (latitude and longitude) in degrees: ");
            x2 = input.nextDouble();
            y2 = input.nextDouble();
            double result = 6371.01 * Math.acos((
            Math.sin(Math.toRadians(x1)) *
            Math.sin(Math.toRadians(x2))) +
            (Math.cos(Math.toRadians(x1)) * 
            Math.cos(Math.toRadians(x2)) * 
            Math.cos(Math.toRadians(y1) - Math.toRadians(y2))));
            System.out.printf("The distance between the two points is %f km.%n", result); 
            System.out.println("Repeat program (enter 1 for repeat 0 for quit)");
            repeatInt = input.nextInt ();
        }
    }
}