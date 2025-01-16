package design.Generator.builders;

import design.Generator.cars.CarType;
import design.Generator.components.Engine;
import design.Generator.components.GPSNavigator;
import design.Generator.components.Transmission;
import design.Generator.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
