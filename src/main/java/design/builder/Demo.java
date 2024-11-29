package design.builder;

import design.builder.builders.CarBuilder;
import design.builder.builders.CarManualBuilder;
import design.builder.cars.Car;
import design.builder.cars.Manual;
import design.builder.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();

        director.constructSportsCar(builder);

        Car car = builder.getresult();
        System.out.println("Car built:\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        // Director may know several building recipes.
        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getManual();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }

}
