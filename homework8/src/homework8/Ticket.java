package homework8;

public class Ticket {
    private String startStation;
    private String stopStation;
    private String startTime;
    private String id;
    private double price;
    private String seat;
    private String trainNumber;

    public Ticket(String startStation, String stopStation, String startTime, String id, double price, String seat, String trainNumber) {
        this.startStation = startStation;
        this.stopStation = stopStation;
        this.startTime = startTime;
        this.id = id;
        this.price = price;
        this.seat = seat;
        this.trainNumber = trainNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "startStation='" + startStation + '\'' +
                ", stopStation='" + stopStation + '\'' +
                ", startTime='" + startTime + '\'' +
                ", id='" + id + '\'' +
                ", price=" + price +
                ", seat='" + seat + '\'' +
                ", trainNumber='" + trainNumber + '\'' +
                '}';
    }

    public void printTicketInfo() {
        System.out.println(this.toString());
    }
}

class Test1 {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("1", "1", "1", "1", 1, "1", "1");
        t1.printTicketInfo();
    }
}
