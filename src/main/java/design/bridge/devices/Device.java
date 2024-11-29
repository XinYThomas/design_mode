package design.bridge.devices;

// 通用设备接口

public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int volume);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
