import java.util.Scanner;

public class Power {

    public static double power(int base, int exponent){
        if(exponent==0)
        {
            return 1;
        }
        else if(exponent>0)
        {
            return base*power(base,exponent-1);
        }
        else{
            return 1/base*power(base,exponent+1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base");
        int base=sc.nextInt();
        System.out.println("Enter exponent");
        int exponent=sc.nextInt();
        System.out.println(base+"to the power of"+exponent+" is "+ power(base,exponent));
        sc.close();

    }
}
