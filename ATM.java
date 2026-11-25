public class ATM {
    public static void main(String[] args) {

        double balance = 10000;
        double[] withdrawalAmounts = {1000, 500, 0};

        for (int i = 0; i < withdrawalAmounts.length; i++) {

            double withdrawalAmount = withdrawalAmounts[i];

            try {
                int times = (int) balance / (int) withdrawalAmount;

                System.out.println("Withdrawal Amount: " + withdrawalAmount);
                System.out.println("Number of times: " + times);
            }
            catch (ArithmeticException e) {
                System.out.println("Invalid withdrawal amount");
            }
        }
    }
}