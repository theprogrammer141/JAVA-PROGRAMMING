import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Buyer extends User{
    private ArrayList<Product> cart = new ArrayList<>();
    public Buyer(String userID, String name) {
        super(userID, name);
    }

    public ArrayList<Product> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Product> cart) {
        this.cart = cart;
    }

    public void addToCart(Product[] products)
    {
        ArrayList<Product> productArrayList = new ArrayList<>(Arrays.asList(products));
        cart.addAll(productArrayList);
    }

    public void displayProductsAddedToCart()
    {
        System.out.println();
        System.out.println("Printing Product Details:-");
        int i = 1;
        for(Product product : cart)
        {
            System.out.printf("---Product %d Details---", i);
            System.out.println();
            System.out.println("Product ID: " + product.getProductID());
            System.out.println("Product Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Seller Name: " + product.getSeller().getName());
            i++;
        }
        System.out.println();
    }
}
