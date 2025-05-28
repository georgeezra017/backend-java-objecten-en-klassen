public class Store {
    String product;
    String price;
    int amount;

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

    public void setProduct(String product){
        this.product = product;
    }

    public void setPrice(String price){
        this.price = price;
    }

    public String getProduct(){
        return product;
    }

    public String getPrice(){
        return price;
    }

}
