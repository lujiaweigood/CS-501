import java.util.Scanner;

public class C2E19AreaOfATriangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int  repeatInt = 1;
        double x1;
        double y1;
        double x2;
        double y2;
        double x3;
        double y3;
        double sum1;
        double sum2;
        double sum3;
        double s;
        double area;
        String intro = "This program allows you to compute for the area of  a triangle";
        String ask1 = "Enter two numbers for point1:";
        String ask2 = "Enter two numbers for point2:";
        String ask3 = "Enter two numbers for point3:";
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

            System.out.println(ask3);
            x3 = input.nextDouble();
            y3 = input.nextDouble();
            sum1 = Math.sqrt( (x2-x1)*(x2-x1) + (y2 - y1)*(y2 - y1) );
            sum2 = Math.sqrt( (x1-x3)*(x1-x3) + (y1 - y3)*(y1 - y3) );
            sum3 = Math.sqrt( (x3-x2)*(x3-x2) + (y3 - y2)*(y3 - y2) );
            s = (sum1 + sum2 + sum3)/2;
            area = Math.sqrt(s * (s - sum1) * (s - sum2) * (s - sum3));

            System.out.println("The area of  the triangle is " + area );
            System.out.println("Repeat program (enter 1 for repeat 0 for quit)");
            repeatInt = input.nextInt ();
        }
    }
}