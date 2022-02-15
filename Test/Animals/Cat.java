package Test.Animals;


import Test.Animals.Animals;

public class Cat extends Animals implements Info{

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void voice() {
        System.out.println("Мяу!");
    }


    @Override
    public void showInfo() {
        System.out.println("Cat id is: " + this.id);
    }
}