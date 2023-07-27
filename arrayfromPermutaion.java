import java.util.Scanner;

public class arrayfromPermutaion
{
    public static void main(String[] args)
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of elements of the array :- ");
            int a = sc.nextInt();
            int[] arr = new int[a];
            int[] num = new int[a];
            System.out.println("Enter the elements of the array and please make sure the elements are less than " + a);

            //Filling the array
            for (int i = 0; i < a ; i += 1)
            {
                arr[i] = sc.nextInt();
            }

            //Building array from permutaion
            for(int i = 0; i < a ; i += 1)
            {
                num[i] = arr[ arr[i] ];
            }
   

            System.out.println("The new array created from permutation is :- ");

            //Printing the array build from permutation
            for(int i = 0; i < a ; i += 1)
            {
                System.out.print( num[i] + "     ");
            }
        }
    }
}
