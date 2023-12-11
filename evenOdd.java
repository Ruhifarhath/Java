import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class evenOdd{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        printEvenOddNumbers(start, end);
    }

    private static void printEvenOddNumbers(int start, int end) {
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenNumbers.add(i);
            } else {
                oddNumbers.add(i);
            }
        }

       
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Even Numbers Count: " + evenNumbers.size());

        
        System.out.println("Odd Numbers: " + oddNumbers);
        System.out.println("Odd Numbers Count: " + oddNumbers.size());
    }
}
