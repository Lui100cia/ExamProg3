import java.time.Instant;
import java.util.List;
import java.util.Objects;

public class Order {
    public enum PaymentStatus { UNPAID, PAID }

    private Integer id;
    private String reference;
    private Instant creationDatetime;
    private List<DishOrder> dishOrderList;
    private PaymentStatus paymentStatus = PaymentStatus.UNPAID;

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getReference() { return reference; }
    public void setReference(String reference) { this.reference = reference; }

    public Instant getCreationDatetime() { return creationDatetime; }
    public void setCreationDatetime(Instant creationDatetime) { this.creationDatetime = creationDatetime; }

    public List<DishOrder> getDishOrderList() { return dishOrderList; }
    public void setDishOrderList(List<DishOrder> dishOrderList) { this.dishOrderList = dishOrderList; }

    public PaymentStatus getPaymentStatus() { return paymentStatus; }
    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = Objects.requireNonNull(paymentStatus);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", reference='" + reference + '\'' +
                ", creationDatetime=" + creationDatetime +
                ", paymentStatus=" + paymentStatus +
                ", dishOrderList=" + dishOrderList +
                '}';
    }

    Double getTotalAmountWithoutVat() {
        throw new RuntimeException("Not implemented");
    }

    Double getTotalAmountWithVat() {
        throw new RuntimeException("Not implemented");
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Order order)) return false;
        return Objects.equals(id, order.id)
                && Objects.equals(reference, order.reference)
                && Objects.equals(creationDatetime, order.creationDatetime)
                && Objects.equals(dishOrderList, order.dishOrderList)
                && Objects.equals(paymentStatus, order.paymentStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, reference, creationDatetime, dishOrderList, paymentStatus);
    }
}