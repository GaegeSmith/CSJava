public class TestProgram {
    public static void main(String[] args) {
        Checking checkAcct = new Checking(0, 100.00, 10.00);
        checkAcct.withdrawl(110.00);
        System.out.println(checkAcct.getBalance());
    }
}
