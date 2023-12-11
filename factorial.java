import java.util.Scanner;

public class factorial {
    public static int fact(int n)
    {
        return (n==0||n==1)?1:n*fact(n-1);
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter no. of test cases");
    int testCases=sc.nextInt();
    while(testCases>0)
    {
        System.out.println("Enter a number: ");
        int n = sc.nextInt();    
        int result=fact(n);
        System.out.println("factorial of "+n+" is: "+result);
        testCases--;
    }
    
    sc.close();

}
    
}