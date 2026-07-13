package bank;

public class TestUser {
    private float balance;

    public TestUser(float initialBalance) {
        this.balance = initialBalance;
    }

    public float getBalance() {
        return balance;
    }

    public void addBalance(float amount) {
        System.out.println("Adding " + amount + " to the account.");
        balance += amount;
        System.out.println("New balance: " + balance);
    }

    public void subtractBalance(float amount) {
        System.out.println("Subtracting " + amount + " from the account.");

        if (balance < amount) {
            System.out.println("Insufficient balance. Current balance: " + balance);
            return;
        }
        
        balance -= amount;
        System.out.println("New balance: " + balance);
    }


    public void printBalance() {
        System.out.println("Current balance: " + balance);
    }

    public float calculateInterests(float interestRate) {
        float interests = balance * interestRate / 100;
        System.out.println("Current balance is: " + balance);
        System.out.println("Calculating interests at rate " + interestRate + "%: " + interests);
        System.out.println("Total balance after adding interests: " + (balance + interests));
        return interests;
    }
}
