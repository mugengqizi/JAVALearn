import java.text.SimpleDateFormat;
import java.util.Date;


public class BorrowInfo {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private String deviceName;
    private String borrowerName;
    private int borrowNumber;
    private String borrowTime;


    public BorrowInfo() {
    }

    public BorrowInfo(String deviceName, String borrowerName, int borrowNumber) {
        this.deviceName = deviceName;
        this.borrowerName = borrowerName;
        this.borrowNumber = borrowNumber;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public int getBorrowNumber() {
        return borrowNumber;
    }

    public void setBorrowNumber(int borrowNumber) {
        this.borrowNumber = borrowNumber;
    }

    public String getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(Date borrowTime) {
        this.borrowTime = sdf.format(borrowTime);
    }

    @Override
    public String toString() {
        return "借用设备 " + deviceName +
                ", 借用人 " + borrowerName +
                ", 借用数目 " + borrowNumber +
                ", 借用时间 " + borrowTime ;
    }
}
