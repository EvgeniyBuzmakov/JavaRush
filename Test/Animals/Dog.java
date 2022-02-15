package Test.Animals;

public class Dog extends Animals implements Info {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void voice() {
        System.out.println("Гав!");
    }


    public void showInfo() {
        System.out.println("Dog name is: " + this.name);
    }
}
