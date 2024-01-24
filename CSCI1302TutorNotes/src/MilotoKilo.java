import java.util.Scanner;

public class MilotoKilo {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("enter miles: ");

        float miles = input.nextFloat();

        float kilom = (float) (miles * 1.61);

        System.out.println("this is miles: "+miles+" this is Kilometers: "+kilom);
    }
}
