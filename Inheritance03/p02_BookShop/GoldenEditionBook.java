package p02_BookShop;

public class GoldenEditionBook extends Book{
    public GoldenEditionBook(String title, String author, Double price) {
        super(title, author, price);
    }

//    @Override
//    public Double getPrice() {
//        return super.getPrice() + 0.3*super.getPrice();
//    }

    @Override
    public void setPrice(Double price) {
        super.setPrice(price + 0.3*price);
    }
}
