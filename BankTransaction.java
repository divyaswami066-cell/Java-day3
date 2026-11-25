
class BankTransaction {
    int balance = 10000;

    void withdraw(String amount) {
        try {
            int money = Integer.parseInt(amount);

            if (money <= 0) {
                throw new IllegalArgumentException("Invalid withdrawal amount");
            }

            if (money > balance) {
                throw new IllegalArgumentException("Insufficient balance");
            }

            balance = balance - money;
            System.out.println("Remaining Balance: " + balance);

        } catch (NumberFormatException e) {
            System.out.println("Invalid amount format");
        } catch (IllegalArgumentException e) {
            if (amount.equals("0")) {
                System.out.println("Zero withdrawal");
            } else if (amount.startsWith("-")) {
                System.out.println("Negative withdrawal");
            } else {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        BankTransaction b = new BankTransaction();

        b.withdraw("2000");
        b.withdraw("15000");
        b.withdraw("abc");
        b.withdraw("-500");
        b.withdraw("0");
    }
}
