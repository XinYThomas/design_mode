package design.builder.builders;

import design.builder.builders.Builder;
import design.builder.cars.CarType;
import design.builder.cars.Manual;
import design.builder.components.Engine;
import design.builder.components.GPSNavigator;
import design.builder.components.Transmission;
import design.builder.components.TripComputer;

public class CarManualBuilder implements Builder {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getManual() {
        return new Manual(carType, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
