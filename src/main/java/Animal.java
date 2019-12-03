public class Animal {

    private String name;

    public Animal(String name){
        this.name = name;
    }
    protected String sounds() {
        return "Sound";
    }
    protected String eat() {
        return "Food";
    }
}