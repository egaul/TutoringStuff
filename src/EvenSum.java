import java.util.Scanner;

public class EvenSum {
    public static void main(String[] arg){

        Scanner evenobject = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int num = evenobject.nextInt();

        int sum = 0;
        if (num >= 2) {
            for (int index = 2; index <= num; index = index + 1) {
                if (index % 2 == 0) {
                    sum += index;
                }
            }
        }
        else{
            System.out.println("Error: ");
        }

        System.out.println("The even summation of: "+num+" is "+sum);
    }
}
