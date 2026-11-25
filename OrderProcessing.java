
class OrderProcessing {
    public static void main(String[] args) {
        double[] productPrices = {45000, 55000, 65000};

        // Test 1
        processOrder("Laptop", "2", 0, productPrices);

        // Test 2
        processOrder("Laptop", "abc", 1, productPrices);

        // Test 3
        processOrder("Laptop", "3", 5, productPrices);
    }

    static void processOrder(String productName, String quantity,
                             int position, double[] productPrices) {
        try {
            int qty = Integer.parseInt(quantity);
            double price = productPrices[position];
            double total = qty * price;

            System.out.println("Product: " + productName);
            System.out.println("Total Price: " + total);

        } catch (NumberFormatException e) {
            System.out.println("Invalid quantity");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid product position");

        } finally {
            System.out.println("Order Processing Completed");
            System.out.println();
        }
    }
}
