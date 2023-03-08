package lib;

public class Bus  extends  Vehicle{


    @Override
    public void move() {
        System.out.println(" Bus is moving on Highway");
    }

    @Override
    public void brake() {
        System.out.println("Bus is Brake ");

    }
}
