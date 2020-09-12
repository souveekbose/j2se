/**
 * Class to create cars
 */
public class CarCreation {
    public static void main(String[] args) {
        CarBlueprint bmw = new CarBlueprint();
        bmw.model = "750d";
        bmw.start();
        bmw.drive();
        bmw.stop();

        CarBlueprint audi = new CarBlueprint();
        bmw.model = "Q4";
        bmw.start();
        bmw.drive();
        bmw.stop();


    }
}