package concreteProduct;

import product.Vehicle;

// concrete product
public class TwoWheeler implements Vehicle {

    @Override
    public void printTyres() {
        System.out.println(2+" chakka");
    }

    public void handleRunner(){
        System.out.println("it runs with the handle");
    }
}
