package Cinema;

import java.util.Objects;

public class Order {
    String movieName;
    int theaterNumber;
    int rowSeatNumber;
    int chairSeatRow;
    int ticketPrice;

    public Order(String movieName, int theaterNumber, int rowSeatNumber, int chairSeatRow, int ticketPrice) {
        this.movieName = movieName;
        this.theaterNumber = theaterNumber;
        this.rowSeatNumber = rowSeatNumber;
        this.chairSeatRow = chairSeatRow;
        this.ticketPrice = ticketPrice;
    }

    public void setSeat(int rowSeatNumberAvailable,int chairSeatRowAvailable) {
        this.rowSeatNumber = rowSeatNumberAvailable;
        this.chairSeatRow = chairSeatRowAvailable;
    }

    @Override
    public String toString() {
        return "Order{" +
                "movieName='" + movieName + '\'' +
                ", theaterNumber=" + theaterNumber +
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
        return theaterNumber == order.theaterNumber && rowSeatNumber == order.rowSeatNumber && chairSeatRow == order.chairSeatRow && ticketPrice == order.ticketPrice && Objects.equals(movieName, order.movieName);
    }
}
