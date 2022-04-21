package Algorithms;

import java.util.Scanner;
/*
Binary Search is a searching algorithm used in a sorted array by repeatedly
dividing the search interval in half.
The idea of binary search is to use the information that the array is sorted
 and reduce the time complexity to O(Log n).
 */

public class BinarySearch {
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
    public static int search(int arr[] , int value){
        int first =0;
        int last = arr.length-1;
        int mid =(first+last)/2;
        while (first<last) {


            if (arr[mid] == value) {
                return mid;
            }
            if (value > arr[mid]) {
                mid = mid+1;



            }
            if (value < arr[mid]) {
                mid = mid-1;

            }

        }

return -1;

    }
}
