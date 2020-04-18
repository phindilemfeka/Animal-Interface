public class Cat implements Animal
    {
        @Override
        public void getSound(String sound)
        {
            sound = "Meow!";
            System.out.println(sound);
        }

        @Override
        public void getAge(int age)
        {
            age = 5;
            System.out.println("I am "+age+" years old");
        }
    }
