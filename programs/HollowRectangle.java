package programs;

public class HollowRectangle {
    public static void main(String[] args) {
        int m = 5 , n=5;

        //outer loop
        for (int i =1 ; i<=m ; i++){
            for (int j = 1 ; j<=n ; j++){
                if(i==1 || j ==1 || i == m || j == n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
