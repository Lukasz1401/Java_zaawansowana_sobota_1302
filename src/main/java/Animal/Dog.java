package Animal;

public class Dog implements Animal, SleepAble {

    @Override
    public void makeASound() {
        System.out.println("Hauhau");
    }

    @Override
    public void sleep() {
    }
}
