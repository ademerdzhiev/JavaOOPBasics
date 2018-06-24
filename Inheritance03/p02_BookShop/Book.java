package p02_BookShop;

public class Book {
    private String title;
    private String author;
    protected Double price;

    public Book(String title, String author, Double price) {
       this.setTitle(title);
        this.setAuthor(author);
        this.setPrice(price);
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        validTitle(title);

        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        validAuthor(author);

        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        validPrice(price);

        this.price = price;
    }

    public static void validAuthor(String author){
        String[] splitAuthor = author.split("\\s+");

        if (splitAuthor.length >= 2) {
            Character testChar = splitAuthor[1].charAt(0);

            if (Character.isDigit(testChar)) {
                throw new IllegalArgumentException("Author not valid!");
            }
        }
    }

    public static void validTitle(String title) {
        if (title.length() < 3) {
            throw new IllegalArgumentException("Title not valid!");
        }
    }

    public static void validPrice(Double price) {
        if(price <= 0) {
            throw new IllegalArgumentException("Price not valid!");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Type: ").append(this.getClass().getSimpleName()).append(System.lineSeparator());
        sb.append("Title: ").append(this.getTitle()).append(System.lineSeparator());
        sb.append("Author: ").append(this.getAuthor()).append(System.lineSeparator());
        sb.append("Price: ").append(this.getPrice()).append(System.lineSeparator());

        return sb.toString();
    }

}
