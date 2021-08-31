package Cinema;

import java.util.Objects;

public class Order {
    String movieName;
    int auditoriumNum;
    int rowSeatNumber;
    int chairSeatRow;
    int ticketPrice;

    public Order(String movieName, int auditoriumNum,int ticketPrice) {
        this.movieName = movieName;
        this.auditoriumNum = auditoriumNum;
        this.ticketPrice =ticketPrice;
    }

    public void Order(String movieName, int auditoriumNum, int rowSeatNumber, int chairSeatRow, int ticketPrice) {

    }

    public void setSeat(int rowSeatNumberAvailable,int chairSeatRowAvailable) {
        this.rowSeatNumber = rowSeatNumberAvailable;
        this.chairSeatRow = chairSeatRowAvailable;
    }

    @Override
    public String toString() {
        return "Order{" +
                "movieName='" + movieName + '\'' +
                ", theaterNumber=" + auditoriumNum +
                ", rowSeatNumber=" + rowSeatNumber +
                ", chairSeatRow=" + chairSeatRow +
                ", ticketPrice=" + ticketPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return auditoriumNum == order.auditoriumNum && rowSeatNumber == order.rowSeatNumber && chairSeatRow == order.chairSeatRow && ticketPrice == order.ticketPrice && Objects.equals(movieName, order.movieName);
    }
}
