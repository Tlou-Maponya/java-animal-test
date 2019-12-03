import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
        // declare objects
        Dog dog = new Dog();
        Cat cat = new Cat();

        @Test
        void testDogSound(){
            assertEquals("Barks", dog.sounds(),"This test passes");

        }
        @Test
        void testDogEats(){
            assertEquals("Food", dog.eat(), "Test case passes");
        }
        @Test
        void testCatSound(){
            assertEquals("Meows", cat.sounds(), "Test case passes");
        }
        @Test
        void testCatEats(){
            assertEquals("Food", cat.eat() , "Test case passes");
        }
    }