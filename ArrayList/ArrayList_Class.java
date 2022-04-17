package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayList_Class {
    ArrayList<Integer> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int size;
    int index;


    public void add(){

        System.out.println("How many number you want to add");
        size=sc.nextInt();
        for (int i=0 ; i<size+1 ; i++){
            list.add(sc.nextInt());
        }
    }
    public void delete(){
        System.out.println("Enter index number to delete");
        index = sc.nextInt();
        list.remove(index);
        System.out.println(list);
    }
    public void sort(){
        Collections.sort(list);
        System.out.println("Sorted Array");
        System.out.println(list);
    }

}
