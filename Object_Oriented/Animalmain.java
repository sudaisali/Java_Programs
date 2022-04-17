package Object_Oriented;

 class Animal {
   public void eat(){
       System.out.println("I can eat");
   }
}
class Dog extends Animal{
     public void name(){
         System.out.println("My name is bob");
         eat();
     }
}
public class Animalmain{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name();

    }
}
