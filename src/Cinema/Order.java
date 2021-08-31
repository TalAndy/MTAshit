package Cinema;

import java.util.Objects;

public class Order {
    String movieName;
    int theaterNumber;
    int rowNumber;
    int chairRow;
    int ticketPrice;

    public Order(String movieName, int theaterNumber, int rowNumber, int chairRow, int ticketPrice) {
        this.movieName = movieName;
        this.theaterNumber = theaterNumber;
        this.rowNumber = rowNumber;
        this.chairRow = chairRow;
        this.ticketPrice = ticketPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return theaterNumber == order.theaterNumber && rowNumber == order.rowNumber && chairRow == order.chairRow && ticketPrice == order.ticketPrice && Objects.equals(movieName, order.movieName);
    }
}
