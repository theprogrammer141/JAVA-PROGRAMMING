public class Transaction {
    private String transactionID;
    private Product product;
    private Seller seller;
    private Buyer buyer;
    private double transactionFee;

    public Transaction(String transactionID, Product product, Seller seller, Buyer buyer, double transactionFee) {
        this.transactionID = transactionID;
        this.product = product;
        this.seller = seller;
        this.buyer = buyer;
        this.transactionFee = transactionFee;
    }

    public String getTransactionID() {
        return transactionID;
    }

    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    public void displayTransactionDetails()
    {
        System.out.println("Transaction ID:" + getTransactionID());
        System.out.println("Buyer: " + buyer.getName());
        System.out.println("Seller: " + seller.getName());
        System.out.println("Product: " + product.getName());
        System.out.println("Product Price: " + product.getPrice());
        System.out.println("Transaction Fee: " + getTransactionFee());
    }
}
