
class OnlinePayment {
    public static void main(String[] args) {
        String[] amounts = {"2500", "1500.50", "abc", "25xyz"};

        for (String paymentAmount : amounts) {
            try {
                double amount = Double.parseDouble(paymentAmount);
                System.out.println(amount);
            } catch (NumberFormatException e) {
                System.out.println("Invalid payment amount");
            }
        }
    }
}
