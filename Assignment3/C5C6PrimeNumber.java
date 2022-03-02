import java.util.Scanner;

class PrimeNumberMethod {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        int number = 2;


        while (count < numberOfPrimes) {

            if (isPrime(number)) {
                count++; 

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {

                    System.out.printf("%-5s\n", number);
                }
                else
                    System.out.printf("%-5s", number);
            }


            number++;
        }
    }


    public static boolean isPrime(int number) 
    {
        if(number == 1) { 
            return false; 
        }
        for (int divisor = 2; divisor <= number/2; divisor++) {
            if (number % divisor == 0) {
                return false; 
            }
        }

        return true; 
    }
}

public class C5C6PrimeNumber {
	
	public static int countPrimes(int range)
	{
		int count = 0;
		for(int i = 2; i <= range; i++)
			if(PrimeNumberMethod.isPrime(i)) {
                 count++; 
                }
		return count;
	}
	
	public static void storePrimes(int[] array)
	{
        int i = 0;
        int start = 2;
		while(i < array.length)
		{
			if(PrimeNumberMethod.isPrime(start)){
                array[i++] = start;
            }
			start++;
		}
	}
    
    
	public static boolean binarySearch(int[] list, int key) 
	{
		int low = 0;
		int high = list.length - 1;
		while (high >= low) 
		{
            int mid = (low + high) / 2;
            if (key == list[mid]){
                return true;
            }
			if (key < list[mid]){
                high = mid - 1;
            }
			else if (key > list[mid]){
                low = mid + 1;
            }
		}
		return false;
	}
	

	public static void displayFactors(int number)
	{
        for (int divisor = 2; divisor <=  Math.sqrt(number);  divisor++){
            if (number % divisor  ==0){
                while(number % divisor ==0){
                    System.out.print(divisor + " ");
                    number = number/divisor;
            }
        }
    }
    System.out.print(number + " ");
}
    

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		System.out.println("This program is to find if a number is prime numbers (less than 1000)");
		System.out.println("If the number you input is not a prime number , the program will display the factors");
		
		int repeat = 1;
		int inputValue;
		int numPrimes = countPrimes(1000);
		int[] array = new int[numPrimes];
		

        storePrimes(array);
        
        System.out.println("The first 50 prime numbers are \n");
        PrimeNumberMethod.printPrimeNumbers(50);


		while(repeat == 1)
		{

			System.out.print("\n Please enter a number (large than 1 less than 1000) to check if it is prime: ");
			inputValue = input.nextInt();
			

			if(inputValue > 1000 || inputValue < 1)
                System.out.println("Input out of range. Must be a number between 1 and 1000 inclusively.");
            else if (inputValue == 1){
                System.out.println(inputValue +" is not a prime number. Here are its prime factors:");
                System.out.println(1);
            }
			else if(binarySearch(array, inputValue))
				System.out.println(inputValue +" is a prime number.");
			else
			{
				System.out.println(inputValue +" is not a prime number. Here are its prime factors:");
                displayFactors(inputValue);
                System.out.println();
			}
			
			System.out.println("Repeat program (enter 1 for repeat 0 for quit)");
			repeat = input.nextInt();
		}
		input.close();
	}

}