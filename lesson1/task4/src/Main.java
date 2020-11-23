public class Main {
   public static void main(String[] args) {
      Cat cat1 = new Cat("cat1",4);
      Dog dog1 = new Dog("dog1",5);
      System.out.println("Имя кота: " + cat1.name + " Возраст кота: " + cat1.age);
      cat1.talk("Мяу1");
      System.out.println("Имя собаки: " + dog1.name + " Возраст собаки: " + dog1.age);
      dog1.talk("Гав1");

      Cat cat2 = new Cat();
      Dog dog2 = new Dog();
      cat2.setName("cat2");
      dog2.setName("dog2");
      cat2.setAge(7);
      dog2.setAge(8);
      System.out.println("Имя кота: " + cat2.getName() + " Возраст кота: " + cat2.getAge());
       cat2.talk();
      System.out.println("Имя собаки: " + dog2.getName() + " Возраст собаки: " + dog2.getAge());
       dog2.talk();

   }


   public static class Animal {
      String name;
      String Voice;
      int age;

      public void talk(String Voice) {
         this.Voice=Voice;
         System.out.println(Voice);
      }
      public String getName() {
         return name;
      }
      public void setName(String name) {
         this.name = name;
      }
      public int getAge() {
         return age;
      }
      public void setAge(int age) {
         this.age = age;
      }
   }

   public static class Cat extends Animal {
      public Cat(String name, int age) {
         this.name = name;
         this.age = age;
      }
       public void talk() {
          System.out.println("Мяу");
       }
      public Cat() {
      }
   }

   public static class Dog extends Animal {
      public Dog(String name, int age) {
         this.name = name;
         this.age = age;

      }
       public void talk() {
           System.out.println("Гав");
       }
      public Dog() {
      }
   }
}