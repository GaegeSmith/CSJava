public class Checking extends Account {
    protected final double OVER_DRAFT_LIMIT;
    public Checking() {
        super();
    }
    public Checking(int id, double startingBal, double overDraftLimit) {
        super(id, startingBal);
        this.OVER_DRAFT_LIMIT = overDraftLimit;
    }
    public String toString() {
        return "Account id: " + this.getId() + "\n\tBalance: " + this.getBalance() + "\n\tOverdraft limit: " + this.OVER_DRAFT_LIMIT + "\n\tDate opened: " + this.getDateCreated();
    }
    @Override
    public void withdrawl(double amount) {
        if ((this.getBalance() - amount) > -this.OVER_DRAFT_LIMIT) {
            
        }
    }
}
