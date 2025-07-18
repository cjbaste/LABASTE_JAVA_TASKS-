package JAVATASKS;

public class Task8 {
    
     private int getSumUpToN(int n) {
        if (n < 0) {
            System.out.println("err. negative numbers are not allowed");
            return 0;
        }
        return n * (n + 1) / 2;
    }
    public int Sums(int... numbers) {
        int overallTotalSum = 0; 
        int totalOfAllCumulativeSums = 0;
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i]; 
            overallTotalSum += currentNumber; 
            
            int SumForCurrentNumber = getSumUpToN(currentNumber);
            System.out.println("For number: (" + currentNumber + "): Cumulative sum (1 to " + currentNumber + ") = " + SumForCurrentNumber);

            int cumulativeSumForCurrentNumber = getSumUpToN(currentNumber);
            totalOfAllCumulativeSums += cumulativeSumForCurrentNumber;
       
        }
        System.out.println("----------------------------------------------");
        System.out.println("Total of all individual cumulative sums = " + totalOfAllCumulativeSums);
        return overallTotalSum;  
    }
    public static void main(String[] args) {
        Task8 calculator = new Task8();

        System.out.println("Example 1: Input parameters (4, 5, 10)");
        int totalSum1 = calculator.Sums(4, 5, 10);
        System.out.println("Total sum of (4 + 5 + 10) = " + totalSum1);
        System.out.println("\n"); 

        System.out.println("Example 2: Input parameters (7, 2, 3)");
        int totalSum2 = calculator.Sums(7, 2, 3);
        System.out.println("Total sum of (7 + 2 + 3) = " + totalSum2);
        System.out.println("\n");

    }
}
