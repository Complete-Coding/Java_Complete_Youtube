package in.kgcoding.challenge80;

public class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public void checkout() {
        System.out.println("checkout");
    }

    public void returnItem() {
        System.out.println("Returning the item");
    }
}
