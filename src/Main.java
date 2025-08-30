import concreteCreator.FourWheelerFactory;
import concreteCreator.TwoWheelerFactory;
import product.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Vehicle twoWheelerVehicle = new TwoWheelerFactory().createVehicle();
        Vehicle fourWheelerVehicle = new FourWheelerFactory().createVehicle();

        twoWheelerVehicle.printTyres();
        fourWheelerVehicle.printTyres();

        // Main disadvantage with this pattern is if I want to provide any separate functionality to
        // any of my vehicle that other vehicle don't have then I can provide but I can n't use that
        // with factory pattern object bcz objects are getting type-casted to Vehicle interface while
        // creating so the functionality can n't be reached from those objects so to use that functionality
        // we need tocretae the separate object which will defy the whole factory pattern concept.
        // like if i want to access 'steeringRunner' method of FourWheeler then I can n't access it by
        // 'fourWheelerVehicle' object bcz it's a vehicle type.
    }
}