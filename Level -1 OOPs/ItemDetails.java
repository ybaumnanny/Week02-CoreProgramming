class Item {
    String itemCode, itemName;
    double price;
    // Constructor created
    Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    // Method to print item details
    void printItemDetails() {
        System.out.println("Name of the item is: " + itemName);
        System.out.println("Code of the item is: " + itemCode);
        System.out.println("Price of the item is: $" + price);
    }

    // Method to calculate total cost for a given quantity
    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}
    public class ItemDetails{
    public static void main(String[] args) { 
        // Creating an Item object
        Item item = new Item("101", "Laptop", 799.99);
        
        // Printing item details
        item.printItemDetails();
        // Calculating total cost for a given quantity
        int quantity = 3;
        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total cost for " + quantity + " items: $" + totalCost);
    }
}

