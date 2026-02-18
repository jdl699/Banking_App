/**
 * the account class, used to create the account class
 *
 * @author jayden lueders
 * @version beta 0.1
 * @since 2025/02/13
 */
public class Account {
    private static int lastId = 0;
    private final int ID;
    String firstName = "?";
    String lastName = "?";
    double balance = 0.0;

    public Account() {
        this.ID = ++lastId;
        this.firstName = "";
        this.lastName = "";
        this.balance = 0.0;
    }

    public Account(String firstName, String lastName) {
        this.ID = ++lastId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdrawal(double amount) {
        if (amount > this.balance) {
            throw new IllegalArgumentException("Insufficient balance");
        } else {
            this.balance -= amount;
        }
    }

    @Override
    public String toString() {
        return "Account [ID=" + ID + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}
