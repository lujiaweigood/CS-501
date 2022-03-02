import java.util.Scanner;

public class C7Array
{  
    static private double[] numbers = new double[10];

    public static double min(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }

    public static int indexOfSmallestElement(double[] array) {
        int indexOfmin = 0;
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
                indexOfmin = i;
            }
        }
        return indexOfmin;
    }
    
    public static void reviseSelectionSort(double[] array){
        for (int i = array.length - 1; i > 0; i--) {
            double currentMax = array[i];
            int currentMaxIndex = i;
            
        for (int j = i - 1; j >= 0 ; j--) {
            if (currentMax > array[j]) {
                currentMax = array[j];
                currentMaxIndex = j;
        }
    }
        if (currentMaxIndex != i){
            array[currentMaxIndex] = array[i];
            array[i] = currentMax;
        }
    }
}

    public static void C7E9(){
        Scanner input = new Scanner(System.in);

        String intro = "The first method that finds the smallest element in an array of double values.";
        String ask = "Please enter ten numbers: ";
        int repeatInt = 1;
        System.out.println(intro);
        System.out.println(ask);
        while (repeatInt ==1){
            // beginning of the code lines responding to the exercise
            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = input.nextDouble();
            }
            System.out.println("The smallest element is: " + C7Array.min(numbers));
            repeatInt = 0;
        }
        System.out.println("---------------------------------------------------------------");
    }

    
    public static void C7E10(){
        int repeatInt = 1;

        String intro = "The second method that finds the index of the smallest element in an array of double values.";

        System.out.println(intro);
        while (repeatInt ==1){
            // beginning of the code lines responding to the exercise

            System.out.println("The index of the smallest elemtnet is: " + C7Array.indexOfSmallestElement(numbers));
            repeatInt = 0;
        }
        System.out.println("---------------------------------------------------------------");
    }

    public static void C7E20(){
        Scanner input = new Scanner(System.in);
        int repeatInt = 1;
        int repeatProgram;
        String intro = "The third method using selection sort to sort an array from the largest number";

        System.out.println(intro);

        // beginning of the code lines responding to the exercise
        while (repeatInt ==1){
        System.out.println("The unsorted array is: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
        }
        C7Array.reviseSelectionSort(numbers);
        System.out.println();
        System.out.println("The sorted array from the smallest element is: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+ " ");
            }
        System.out.println();
        System.out.println("---------------------------------------------------------------");
        System.out.println();
        System.out.println("Repeat program (enter 1 for repeat 0 for quit)");
        repeatProgram = input.nextInt ();
        if (repeatProgram ==1) {
            C7E9();
        }else {
            repeatInt = 0;
        }
    }
}



    public static void main(String[] args)
    {
        C7E9();
        C7E10();
        C7E20();
    }
}