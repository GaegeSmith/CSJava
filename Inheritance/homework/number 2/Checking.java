public class Checking extends Account {
    protected final double OVER_DRAFT_LIMIT;
    protected boolean limitReached;
    public Checking() {
        super();
        this.OVER_DRAFT_LIMIT = 10.00; // default overdraft limit of $10
    }
    public Checking(int id, double startingBal, double overDraftLimit) {
        super(id, startingBal);
        this.OVER_DRAFT_LIMIT = overDraftLimit;
        this.limitReached = startingBal < -this.OVER_DRAFT_LIMIT;
    }
    public String toString() {
        return "Account id: " + this.getId() + "\n\tBalance: " + this.getBalance() + "\n\tOverdraft limit: " + this.OVER_DRAFT_LIMIT + "\n\tOverdraft limit reached: " + (this.getLimitReached()) + "\n\tDate opened: " + this.getDateCreated();
    }
    public boolean getLimitReached() {
        return this.limitReached;
    }
    public boolean checkOverdraftLimit() {
        return this.getBalance() < -this.OVER_DRAFT_LIMIT;
    }
    @Override
    public void withdraw(double amount) {
        if ((this.getBalance() - amount) < -this.OVER_DRAFT_LIMIT) {
            this.balance -= amount;
        } else {
            this.limitReached = true;
        }
    }
    @Override
    public void deposit(double amount) {
        this.balance += amount;
        this.limitReached = this.getBalance() < -this.OVER_DRAFT_LIMIT;
    }
}
