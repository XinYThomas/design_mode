package design.builder.builders;
// 通用生成器接口
import design.builder.cars.CarType;
import design.builder.components.Engine;
import design.builder.components.GPSNavigator;
import design.builder.components.Transmission;
import design.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType carType);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
