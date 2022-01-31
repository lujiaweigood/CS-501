import java.util.Scanner;

public class C2E15DistanceOfTwoPoints
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int  repeatInt = 1;
        double x1;
        double y1;
        double x2;
        double y2;
        double sum;
        String intro = "This program allows you to compute for a distance of  two points";
        String ask1 = "Enter x1 and y1:separated by at least one space:";
        String ask2 = "Enter x2 and y2:separated by at least one space:";
        System.out.println(intro );
        System.out.println("---------------------------------------------------------------");
        while (repeatInt ==1){
            // beginning of the code lines responding to the exercise
            System.out.println(ask1);
            x1 = input.nextDouble();
            y1 = input.nextDouble();
            System.out.println(ask2);
            x2 = input.nextDouble();
            y2 = input.nextDouble();
            sum = Math.sqrt( (x2-x1)*(x2-x1) + (y2 - y1)*(y2 - y1) );
            System.out.println("The distance of  two points is " + sum );
            System.out.println("Repeat program (enter 1 for repeat 0 for quit)");
            repeatInt = input.nextInt ();
        }
    }
}