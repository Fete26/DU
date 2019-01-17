public class ShoppingCart {

    private float totalPrice;
    private int numberOfItems;

    public float getTotalPrice() {
        return totalPrice;
    }

    public int getNumberOfItems() {
        return numberOfItems;
    }
     public void addItems(float price, int numberOfItems){
        this.totalPrice += price;
        this.numberOfItems += numberOfItems;
        return;
    }
    public void addItems(float price){
        this.totalPrice += numberOfItems;
        numberOfItems++;
        return;
    }
    public void addItems(Item item){

        this.totalPrice += item.getPrice();
        numberOfItems++;
        return;
    }


    public void addItems(Item []list){
        for(int i =0;i< list.length;i++){
            this.totalPrice += list[i].getPrice();
            numberOfItems++;

        }
        return;

    }

}

