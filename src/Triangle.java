//import Scanner class so we can get user input
import java.util.Scanner;

public class Triangle {//Class header
    public static void main(String[] args){//main method header

        Scanner user_in = new Scanner(System.in);//Instantiate a Scanner object using the keyword new and the Scanner constructor

        System.out.println("This program will calculate the area of a triangle using Heron's formula");//Introductory prompt

        System.out.println("enter length a: ");//user prompt for length "a" of triangle
        int a = user_in.nextInt();//creating integer a variable to store next int form user.

        System.out.println("enter length b: ");//user prompt for length "b" of triangle
        int b = user_in.nextInt();//creating integer b variable to store next int form user.

        System.out.println("enter length c: ");//user prompt for length "c" of triangle
        int c = user_in.nextInt();//creating integer c variable to store next int form user.

        int total_length = a+b+c;//calculating perimeter of triangle

        int s = total_length/2;//calculating s as per Heron's formula

        int area = (int) Math.sqrt(s*(s-a)*(s-b)*(s-c));//calculating area of triangle using Heron's formula

        System.out.println("The area of the triangle is : "+area);//printing result
    }
}
