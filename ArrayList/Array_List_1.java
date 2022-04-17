package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Array_List_1 {
    public static void main(String[] args) {
        // DECLARE ARRAY LIST
        ArrayList<String> names = new ArrayList<String>();
        // ADD ELEMENT IN LIST
        names.add("SUDAIS ALI");
        names.add("Burhan ali saif");
        names.add("Talha Saddique");
        names.add("Usama Naseer");
        names.add("Abdullah saif");
        names.add("Abdullah ashiq");
        System.out.print(names+"\n");
        //REPLACE ELEMENT
        names.set(1,"SUDAIS BIN SOHAIL");
        names.set(0,"Burhan Ali Saif");
        System.out.print(names+"\n");
        // ADD ELEMENT IN PARTICULAR INDEX
        names.add(0,"Abdullah Saif");
        System.out.println(names+"\n");
        names.remove(5);
        // PRINT ARRAY LIST BY LOOP
        System.out.println(names);
        for (int i=0 ; i<names.size();i++){
            System.out.println(i+"\t"+names.get(i));
        }
        //SORT ELEMENT WITH COLLECTION
        Collections.sort(names);
        System.out.println(names);

    }
}
