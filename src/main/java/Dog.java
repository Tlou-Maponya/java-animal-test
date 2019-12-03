public class Dog extends Animal {

    private static String name = "Rax";

    Dog(){
        super(name);
    }
    public String sounds() {
        System.out.println(name + " Barks");
        return "Barks";
    }
}