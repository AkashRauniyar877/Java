package oopsJava.Feb;


    class Animal{
        void eat(){
            System.out.println("Eating...");
        }
    }
    class Dog extends Animal{
        void bark(){
            System.out.println("Barking...");
        }
    }

    class BabyDog extends Dog{
        void weep(){
            System.out.println("Weeping...");
        }
    }

    public class inheritence {
        public static void main(String[] args) {
            BabyDog d = new BabyDog();
            d.eat(); // Inherited from Animal
            d.bark(); // Inherited from Dog
            d.weep(); // Defined in BabyDog
        }
    
}
