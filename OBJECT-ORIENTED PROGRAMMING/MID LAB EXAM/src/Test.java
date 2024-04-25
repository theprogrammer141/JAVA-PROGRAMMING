public class Test {
    public static void main(String[] args) {
        Seller seller1 = new Seller("S101", "Ahmed");
        Seller seller2 = new Seller("S102", "Imran");

        Product arr[] = new Product[2];
        arr[0] = new Product("Laptop", seller1, 1200000.0, "P201");
        arr[1] = new Product("Smartphone", seller2, 2180000.0, "P202");

        Buyer buyer1 = new Buyer("B301", "Tooba");
        Buyer buyer2 = new Buyer("B302", "Hassan");

        Transaction transaction1 = new Transaction("T401", arr[0], seller1, buyer2, 200);
        transaction1.displayTransactionDetails();

        buyer1.addToCart(arr);
        buyer1.displayProductsAddedToCart();

        seller1.listProduct(arr[0]);
        seller1.listProduct(arr[1]);
        seller1.printInventoryDetails();

    }
}
