public class Cat extends Animal {

    private static String name = "Storm";

    Cat() {
        super(name);
    }
    public String sounds() {
        System.out.println(name + " Meows");
        return "Meows";
    }
}