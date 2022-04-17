package programs;
import java.util.Scanner;
public class factorial {

    public static void main(String[] args) {
        int number;
        int fac=1;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number to find factorial");
        number = obj.nextInt();
        for ( int i=1 ; i<=number ; i++){
           fac = fac*i;
        }
        System.out.println(fac);
    }
}
