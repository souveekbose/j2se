/**
 * Class to demonstrate private access modifier
 */
public class Access {

    public static void main(String[] args) {

        Car bmw = new Car();
        bmw.startCar();
        bmw.drive();

        bmw.stop();

        bmw.drive();


    }
}


class Car {

    public String name;
    private boolean isStarted;

    public void startCar() {
        isStarted = true;
    }

    public void drive() {
        if(isStarted == true) {
            System.out.println("The car is moving");
        }
        else {
            System.out.println("The car is not started");
        }
    }

    public void stop() {
        isStarted = false;
    }


}



// public
// private
// default : Don't write default
// protected : covered in inheritance: A P I E