package concreteProduct;

import product.Vehicle;

// concrete product
public class FourWheeler implements Vehicle {

    @Override
    public void printTyres() {
        System.out.println(4+" chakka");
    }

    public void steeringRunner(){
        System.out.println("it runs with the steering");
    }
}
