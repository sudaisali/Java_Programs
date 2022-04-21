package Algorithms;

import java.util.Scanner;
/*
The time complexity of the above algorithm is O(n).
Linear search is rarely used practically because other search algorithms
such as the binary search algorithm and hash tables allow significantly faster-searching
comparison to Linear search.

 */
public class LinearSearch {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,5,6,7,8,9,10};
        int value;
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to search from array :");
        value=sc.nextInt();
        result = search(array , value);
        if (result == -1){
            System.out.println("Number not found");
        }
        else{
            System.out.println("Number found at :"+result);
        }
    }
    public static int  search(int arr[] , int value){
        int n  = arr.length;
        for (int i = 0 ; i<=n; i++){
            if (value == arr[i]){
               return i;
            }
        }
        return -1;
    }
}
