public class CD implements RetailItem, Displyable{
    private double Price;
    private String Title;
    private String Artist;

    public CD() {
    }

    public CD(double price, String title, String artist) {
        Price = price;
        Title = title;
        Artist = artist;
    }


    public double GetItemPrice() {

        return Price;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String GetInfo() {
        return String.format("CD Information:%n" +
                "Title: %s%n" +

                "Artist: %s%n" +

                "Price: %.2f%n" ,Title,Artist,Price);
    }
}
