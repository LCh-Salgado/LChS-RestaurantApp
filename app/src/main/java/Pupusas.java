public class Pupusas {

    private String filling;
    private int quantity;
    private  double price;
    private final static double BASE_PRICE = 2.50;

    public Pupusas(String filling, int quantity) {
        this.filling = filling;
        this.quantity = quantity;
        this.price = calcPrice();
    }

    public Pupusas() {
        this.filling = "Revueltas";
        this.quantity = 0;
        this.price = calcPrice();


    }

    public void setFilling(String filling) {
        this.filling = filling;
        this.price = calcPrice();

    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        this.price = calcPrice();

    }

    public String getFilling() {
        return filling;
    }

    public int getQuantity() {
        return quantity;
    }
    public double calcPrice() {

        if (filling.equals("queso") ){
            price=(BASE_PRICE+0)*quantity;
        }

        else if (filling.equals("revueltas")){
            price=(BASE_PRICE+0.50)*quantity;
        }

        else if (filling.equals("frijol con queso")){
            price=(BASE_PRICE+0.25)*quantity;
        }
        else if(filling.equals("loroco con queso")) {
            price=(BASE_PRICE+0.50)*quantity;
        }
        else if(filling.equals("Chicarron con queso")) {
            price=(BASE_PRICE+0)*quantity;
        }
        else if(filling.equals("Pupusa loca")) {
            price=(BASE_PRICE+0)*quantity;
        }
        else if(filling.equals("Jalapeno con queso")) {
            price=(BASE_PRICE+0.50)*quantity;
        }

        return price;
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
