public class Checking extends Account {
    protected final double OVER_DRAFT_LIMIT;
    public Checking() {
        super();
    }
    public Checking(int id, double startingBal, double overDraftLimit) {
        super(id, startingBal);
        this.OVER_DRAFT_LIMIT = overDraftLimit;
    }
    
}
