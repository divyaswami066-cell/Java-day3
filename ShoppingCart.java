import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {

        String[] products = {
            "Laptop", "Mobile", "Headphones", "Keyboard", "Mouse"
        };

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter product position: ");
            int position = sc.nextInt();

            System.out.println("Selected product: " + products[position - 1]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid product position");
        }

        sc.close();
    }
}