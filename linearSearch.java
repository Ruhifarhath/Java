import java.util.Scanner;

public class linearSearch {
    public static int search(int[] arr, int target)
    {
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                index=i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter no of testCases");
        int testCases=sc.nextInt();

        while (testCases>0) {
            
        System.out.println("Enter array size");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter "+size+" array elements");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target element");
        int target=sc.nextInt();
        System.out.println("target element "+target+" found at index "+search(arr,target));
        testCases--;
        }
        
        sc.close();
    }
}
