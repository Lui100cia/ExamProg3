import java.time.Instant;
import java.util.Objects;

public final class Sale {
    private final Integer id;
    private final Instant saleDatetime;
    private final Integer orderId;

    public Sale(Integer id, Instant saleDatetime, Integer orderId) {
        this.id = id;
        this.saleDatetime = saleDatetime;
        this.orderId = orderId;
    }

    public Integer getId() { return id; }
    public Instant getSaleDatetime() { return saleDatetime; }
    public Integer getOrderId() { return orderId; }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Sale sale)) return false;
        return Objects.equals(id, sale.id)
                && Objects.equals(saleDatetime, sale.saleDatetime)
                && Objects.equals(orderId, sale.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, saleDatetime, orderId);
    }

    @Override
    public String toString() {
        return "Sale{" +
                "id=" + id +
                ", saleDatetime=" + saleDatetime +
                ", orderId=" + orderId +
                '}';
    }
}
