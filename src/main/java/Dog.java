 public class Dog implements Animal
    {
        @Override
        public void getSound(String sound)
        {
            System.out.println("I "+sound);
        }

        @Override
        public void getAge(int age)
        {
            System.out.println("I am "+age+" years old");
        }
    }


