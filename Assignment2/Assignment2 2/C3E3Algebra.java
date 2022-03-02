import java.util.Scanner;

public class C3E3Algebra
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int  repeatInt = 1;
        double a;
        double b;
        double c;
        double d;
        double e;
        double f;
        double x;
        double y;

        String intro = "Use 6 variable to solve the equation";
        String ask = "ax + by = e     cx + dy = f    x = (ed - bf)/(ad - bc)   y = (af - ec)/(ad - bc) if ad - bc is not equal to 0.";
        String ask2 = "Enter Enter six numbers for a b c d e f in a single line separated by spaces";
        System.out.println(intro );
        System.out.println(ask);
        System.out.println(ask2);
        System.out.println("---------------------------------------------------------------");
        while (repeatInt ==1){
            // beginning of the code lines responding to the exercise
            a = input.nextDouble();
            b = input.nextDouble();

            c = input.nextDouble();
            d = input.nextDouble();

            e = input.nextDouble();
            f = input.nextDouble();
            if (a*d - b*c == 0){
                System.out.println("The equation has no solution.");
                System.out.println("Repeat program (enter 1 for repeat 0 for quit)");
                repeatInt = input.nextInt ();
            } else{
            x = (e*d - b*f)/(a*d - b*c);
            y = (a*f - e*c)/(a*d - b*c);
            System.out.println("x is " + x +" and y is " + y);
            System.out.println("Repeat program (enter 1 for repeat 0 for quit)");
            repeatInt = input.nextInt ();
            }
        }
    }
}