package Student_Teacher_Inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Teacher t1 = new Teacher();
        Scanner obj = new Scanner(System.in);
        int value;
        char choice;
        do {

        System.out.println("1-Enter Student Detail");
        System.out.println("2-Enter Teacher Detail");
        System.out.println("3-View Student Detail");
        System.out.println("4-View Teacher Detail");


        value = obj.nextInt();


            switch (value) {
                case 1:
                    s1.getname();
                    s1.getid();
                    s1.getage();
                    s1.getcity();
                    s1.setGender();
                    break;
                case 2:
                    t1.getname();
                    t1.getid();
                    t1.getcity();
                    t1.getage();
                    t1.setGender();


                    break;
                case 3:
                    s1.displayname();
                    s1.displayid();
                    s1.display_age();
                    s1.display_city();
                    s1.displaygender();
                    break;
                case 4:
                    t1.displayname();
                    t1.displayid();
                    t1.display_age();
                    t1.display_city();
                    s1.displaygender();

            }
            System.out.println("Do you want to continue [y/n] ?");
            choice = obj.next().charAt(0);
        }while (choice == 'y'|| choice == 'Y');

    }
}
