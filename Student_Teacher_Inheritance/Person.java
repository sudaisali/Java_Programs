package Student_Teacher_Inheritance;

import java.util.Scanner;

public class Person {
    int age;
    String city;
    String gender;
    int choice;
    Scanner obj = new Scanner(System.in);


    public void setGender() {
        System.out.println("Please select your gender");
        System.out.println("1-Male");
        System.out.println("2-Female");
        choice = obj.nextInt();
        if (choice == 1) {
            gender = "Male";
        }
        else {
            gender = "Female";
        }
    }
        public void displaygender(){
            System.out.println("Gender :"+ gender);
        }






}
