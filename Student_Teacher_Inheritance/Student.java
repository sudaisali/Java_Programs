package Student_Teacher_Inheritance;

import java.util.Scanner;

public class Student extends Person{
    String name;
    int id;
    Scanner obj = new Scanner(System.in);

    @Override
    public void setGender() {
        super.setGender();
    }

    @Override
    public void displaygender() {
        super.displaygender();
    }

    public void getage(){
        System.out.println("Please Enter your age");
        age = obj.nextInt();

    }
    public void getcity(){
        System.out.println("Enter your city");
        city = obj.next();
    }
    public void display_age(){
        System.out.println("Age :" + age);
    }
    public void display_city(){
        System.out.println("City :" + city);
    }

 public void getname(){
     System.out.println("Enter Student name");
     name = obj.nextLine();

 }
    public void getid(){
        System.out.println("Enter Student Id");
        id= obj.nextInt();

    }
    public void displayname(){
        System.out.println("Student name :"+name);
    }
    public void displayid(){
        System.out.println("Student Id :"+id);
    }
}
