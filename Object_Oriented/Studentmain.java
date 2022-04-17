package Object_Oriented;

     class Student{
        String name;
        int age;
        int id;
        int number;
        String gender;
       // this is a reference variable that refers to the current object.
         Student(String name , int id , int age , int number){  // parametrize constructor
           this. name = name;
          this.  age = age;
          this.  id = id;
         this.   number = number;
         }
        // this() constructor call should be used to reuse the constructor from the constructor
         Student(String name , int id , int age , int number,String gender){
             this(name, id, age, number); //constructor reuse
             this.gender = gender;


         }

         Student(Student s1){  //Copy constructor
             System.out.println(s1.name);
         }

        public void display(){
            System.out.print(name);
            System.out.print(age);
            System.out.print(id);
            System.out.print(number);
            System.out.println(gender);
        }
            }

public class Studentmain {
    public static void main(String[] args) {
        Student s1 = new Student("Sudais",20,219,0300 );
        Student s2 = new Student("talha",20,219,0300);
        Student s4 = new Student("talha",20,219,0300 , "Male");
        Student s3 = new Student(s1);
        s1.display();
        s2.display();
        s4.display();

    }
}
