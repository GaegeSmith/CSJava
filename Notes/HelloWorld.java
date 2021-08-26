import java.io.IOException;
public class HelloWorld {
    public static void main(String[] args) {
        clear();
        System.out.println("Hello world!");
    }
    public static void clear(){
    //Clears Screen in java
        try {
            if (System.getProperty("os.name").contains("Windows"))
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            else
                Runtime.getRuntime().exec("clear");
        } catch (IOException | InterruptedException ex) {
            
        }
    }
}
