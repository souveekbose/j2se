/**
 * Blueprint for car creation
 */
public class CarBlueprint {
    //states or data members
    String model;
    int height;
    int width;
    int capacity;

    // Behaviours or member functions

    //Method to start the car
    void start() {
        System.out.println("Starting "+model);
    }

    //Method to drive the car
    void drive() {
        System.out.println("Driving "+model);
    }

    //Method to stop the car
    void stop() {
        System.out.println("Stopping "+model);
    }
}