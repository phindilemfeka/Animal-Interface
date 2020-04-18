 import  java.util.Scanner;
    public class Main
    {
        public static void main(String[] args)
        {
        System.out.println("Welcome!, Please enter 1 for Dog properties and 2 for Cat properties.");
        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        if (input.equals("1"))
        {
            Home.getIdentity1();
            Bobby bob =new Bobby();
            bob.getFood();
            Dog dog = new Dog();
            dog.getSound("Bark!");
            dog.getAge(7);
    }
        if (input.equals("2"))
        {
            Home.getIdentity2();
            Sthandwa stha = new Sthandwa();
            stha.getFood();
            Cat cat = new Cat();
            cat.getSound(" Meow");
            cat.getAge(5);
        }


        }
    }

