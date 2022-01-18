public class Savings extends Account {
    public Savings() {
        super();
    }
    public Savings(int id, double startingBal) {
        super(id, startingBal);
    }
    public String toString() {
        return "Account id: " + this.getId() + "\n\tBalance: " + this.getBalance() + "\n\tDate opened: " + this.getDateCreated();
    }
    @Override
    public void withdraw(double amount) {
        if ((this.getBalance() - amount) < 0) {
            this.balance -= amount;
        }
    }
    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }
}
