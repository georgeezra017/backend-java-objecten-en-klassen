public class Store {
    String product;
    String price;
    int amount

    public Store(String product, String price) {
        this.product = product;
        this.price = price;
    }

    public int getAmount(){
        return amount;
    }

    public void setAmount(int amount){
        this.amount = amount;
    }

    public String getProduct(){
        return product;
    }

    public String getPrice(){
        return price;
    }

}
