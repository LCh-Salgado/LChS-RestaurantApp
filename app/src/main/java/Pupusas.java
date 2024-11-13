public class Pupusas {

    private String filling;
    private int quantity;
    private  double price;
    private final static double BASE_PRICE = 2.50;

    public Pupusas(String filling, int quantity) {
        this.filling = filling;
        this.quantity = quantity;
    }

    public Pupusas() {
        this.filling = "Revueltas";
        this.quantity = 0;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getFilling() {
        return filling;
    }

    public int getQuantity() {
        return quantity;
    }
    public double calcPrice() {

    }


    @Override
    public String toString() {
        return "Pupusas{" +
                "filling='" + filling + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

}
