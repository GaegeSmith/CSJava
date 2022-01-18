public class TestProgram {
    public static void main(String[] args) {
        Checking checkAcct = new Checking(0, 100.00, 10.00);
        System.out.println(checkAcct.toString());
        Savings saveAcct = new Savings(1, 1000.00);
        System.out.println(saveAcct.toString());
    }
}
