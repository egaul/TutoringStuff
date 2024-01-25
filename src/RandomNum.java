
import java.util.Random;
public class RandomNum {
    public static void main(String[] arg){

        Random rand = new Random();

        int n1,n2,n3,n4,n5,n6;

        n1 = rand.nextInt(10);
        n2 = rand.nextInt(10);
        n3 = rand.nextInt(10);
        n4 = rand.nextInt(10);
        n5 = rand.nextInt(10);
        n6 = rand.nextInt(10);

        System.out.println("Your UNG ID number is : 900"+n1+n2+n3+n4+n5+n6);

    }
}
