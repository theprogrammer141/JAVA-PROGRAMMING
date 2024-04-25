import java.util.ArrayList;
import java.util.Properties;

public class Seller extends User{
    private ArrayList<Product> inventory = new ArrayList<>();

    public Seller(String userID, String name) {
        super(userID, name);
    }

    public ArrayList<Product> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Product> inventory) {
        this.inventory = inventory;
    }

    public void listProduct(Product product)
    {
        inventory.add(product);
    }

    public void printInventoryDetails()
    {
        System.out.println();
        System.out.println("---Printing Inventory Details---");
        System.out.println("Inventory Management for Seller: " + getName());
        for(Product product : inventory) {
            System.out.println("Product ID: " + product.getProductID());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println();
        }
        System.out.println();
    }
}
