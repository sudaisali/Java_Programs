package programs;

public class SolidRectangle {
    public static void main(String[] args) {
        int i , j;
        // outer loop
        for(i=1 ; i<=5 ; i++){
            //inner loop
            for (j=1 ; j<=5 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
