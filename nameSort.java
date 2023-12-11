import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class nameSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();
        scanner.nextLine();  

        List<String> names = new ArrayList<>();
        for (int i = 0; i < numNames; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }

      
        sortNamesAscending(names);
        System.out.println("Names in Ascending Order: " + names);

        sortNamesDescending(names);
        System.out.println("Names in Descending Order: " + names);
    }

    private static void sortNamesAscending(List<String> names) {
        Collections.sort(names);
    }

    private static void sortNamesDescending(List<String> names) {
        Collections.sort(names, Collections.reverseOrder());
    }
}

