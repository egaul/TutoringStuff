import java.util.Scanner;

public class findChar {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        int count = 0;

        System.out.println("Enter a string: ");
        String line = input.nextLine();
        System.out.println("Enter a Character: ");
        char character = input.next().charAt(0);

        for (int i = 0; i < line.length(); i++){
            if (line.charAt(i) == character){
               count++;
            }
        }

        System.out.println("The character: "+character+" appears "+count+" time(s)");
    }
}
