import java.util.Scanner;

public class SmithBellringer0830 {
    public static void main(String[] args) {
        clear();
        Scanner ui = new Scanner(System.in);
        System.out.println("  Hello human");
        System.out.print("Tell me your name ");
        String name = ui.nextLine();
        System.out.println(name + ", where do you go to school? ");
        String school = ui.nextLine();
        System.out.println("Do you like going there? ");
        String status = ui.nextLnie();
        System.out.println(name + ", I hope you enjoy your day at " + school);
        
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