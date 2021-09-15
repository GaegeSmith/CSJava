import java.util.Scanner;
public class AdvancedCondish {
    public static void main(String[] args) {
        // int a = 1;
        // int b = 2;
        // int c = 1;

        // System.out.println(a > b && a > c);
        // System.out.println(a > b || a > c);
        // what();
        boolean loggedin = login();
        while(!loggedin) {
            loggedin = login();
        }
        
    }

    private static void what() {
        Scanner ui = newScanner();
        System.out.println("Hay... guess what");
        String input = ui.nextLine();
        while (!input.equals("what")) {
            System.out.println("Hay... guess what");
            input = ui.nextLine();
        }
        System.out.println("chicken bottom");
    }
    private static Scanner newScanner() {
        return new Scanner(System.in);
    }
    private static boolean login() {
        String un = "billybob";
        String pw = "123456";

        Scanner ui = newScanner();


        
        System.out.print("username: ");
        String username = ui.nextLine();
        System.out.print("password: ");
        String password = ui.nextLine();
        
        if (username.equals(un) && password.equals(pw)) {
            return true;
        } else {
            System.out.println("I'm gonna give ya till the count of ten ta get yer ugly, yellow, no good keester off my property\nbefore I pump your guts full-a lead.\n1..2..10");
            return false;
        }

    }

}
