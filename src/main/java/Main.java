public class Main {
    public static void main(String[] args){

        Dog dog = new Dog();
        dog.eat();           // Rax eats
        dog.sounds();        // Dog barks

        System.out.println();

        Cat cat =  new Cat();
        cat.eat();              // Stormy eats
        cat.sounds();           // Cat meows
    }
}