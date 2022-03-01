package Products;

public class Orders {
    private int price;
    private String status;

    public Orders(int price, String status) {
        this.price = price;
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "price=" + price +
                ", status='" + status + '\'' +
                '}';
    }
}
