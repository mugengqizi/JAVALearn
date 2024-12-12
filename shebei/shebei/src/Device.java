import java.text.SimpleDateFormat;
import java.util.Date;


public class Device {
    private String deviceName;
    private String deviceType;
    private int deviceNumber;
    //入库时间
    private String deviceTime;
    //设备状态
    private DeviceStatus deviceStatus;

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    public Device() {
        deviceTime = sdf.format(new Date());
        deviceStatus = DeviceStatus.AVAILABLE;
    }

    public Device(String deviceName, String deviceType, int deviceNumber) {
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.deviceNumber = deviceNumber;
        deviceTime = sdf.format(new Date());
        deviceStatus = DeviceStatus.AVAILABLE;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }

    public int getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(int deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    public String getDeviceTime() {
        return deviceTime;
    }

    public void setDeviceTime(Date deviceTime) {
        this.deviceTime = sdf.format(deviceTime);
    }

    public DeviceStatus getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(DeviceStatus deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    @Override
    public String toString() {
        return "Device{" +
                "设备名称" + deviceName  +
                ", 设备类型" + deviceType  +
                ", 设备数目" + deviceNumber +
                ", 入库时间" + deviceTime  +
                ", 设备状态" + deviceStatus+
                '}';
    }
}
