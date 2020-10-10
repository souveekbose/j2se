/**
 * Program to demonstrate for inheritance
 */

//interfaces are contracts
interface Vehicle {
    boolean isStarted = false;

    String companyName = "BMW";

    int wheelCount = 2;

}

class Car implements Vehicle {

    private String carName;
    int wheelCount = 4;

}

class Truck implements Vehicle {

    private String truckName;
    int wheelCount = 8;

}

class Motorcycle implements Vehicle {

    private String motorCycleName;

}


public class InheritanceDemo {
    public static void main(String[] args) {

        // new object for Vehicle
        /*Vehicle vehicle = new Vehicle();
        //calls the getCompany method
        String cname = vehicle.getCompany();
        System.out.println("CompanyName is: "+ cname);*/

        Car mycar = new Car();

        System.out.println("Name of the car: "+ mycar.wheelCount);

        Motorcycle cycle = new Motorcycle();
        System.out.println("Motorcycle wheelcount: "+cycle.wheelCount);

    }
}