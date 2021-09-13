import java.util.Scanner;

public class HelloScanner {
    public static void main(String[] args) {
        clear();
        Scanner ui = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = ui.nextLine();
        System.out.println("Hello there " + name + "!");
        
        ui.close();
    }
    
    public static void clear(){
    //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (Exception ex) {
            
        }
    }
}