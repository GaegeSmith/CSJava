public abstract class Account {  
    protected int id;  
    protected double balance;  
    protected static double annualInterestRate;  
    protected java.util.Date dateCreated;  
    public Account() {    
        dateCreated = new java.util.Date();  
    }  
    public Account(int newId, double newBalance) {    
        id = newId;    
        balance = newBalance;    
        dateCreated = new java.util.Date();  
    }  
    public int getId() {    
        return this.id;  
    }  
    public double getBalance() {    
        return this.balance;  
    }  
    public static double getAnnualInterestRate() {    
        return annualInterestRate;  
    }  
    public void setId(int newId) {    
        this.id = newId;  
    }  
    public void setBalance(double newBalance) {    
        this.balance = newBalance;  
    }  
    public static void setAnnualInterestRate(double newAnnualInterestRate) {    
        annualInterestRate = newAnnualInterestRate;  
    }  
    public double getMonthlyInterest() {    
        return this.balance * (annualInterestRate / 1200);
    }  
    public java.util.Date getDateCreated() {    
        return this.dateCreated;  
    }
    public abstract void withdraw(double amount);  
    public abstract void deposit(double amount);
}