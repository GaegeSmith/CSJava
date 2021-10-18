import java.util.Scanner;
public class ArrayNotes {
     public static void main(String[] args){
          /*
               Python - List
                    listy=[1,22,"string or something",[1,2,3],True,func()]
                    listy[2] -> "string or something"
                    listy[2] = "poop"
                    listy -> [1,22,"poop",[1,2,3],True,func()]

               Data Types:
                    Boolean
                    Integers
                    Floats
                    Array
                    String
                    Dictionary
                    Tuple 

          */
          //datatype [] nameOfArray = {the data}
          int[] numbers={1,2,3,4,5,6,7,8,9};
          double[] decimalNumbers={1.1,2.2,3.3,4.4,5.5,6.6};

          //empty list -> listy=[]
          // int[] emptyNumbers; 
          int[] emptyNumbers = new int[28];
          double[] emptyDeciNumbers = new double[28];
          String[] emptyStringNumbers = new String[28];
          boolean[] emptyBoolNumbers = new boolean[28];

          // System.out.println(numbers);       cannot print the array
          // System.out.println(decimalNumbers);       cannot print the array
          //System.out.println(emptyNumbers);  literally there's nothing there
          // System.out.println(emptyNumbers2);       cannot print the array

          // printArray(numbers);
          // System.out.println();
          // printArray(decimalNumbers);
          // System.out.println();
          // printArray(emptyNumbers);
          // System.out.println();
          // printArray(emptyDeciNumbers);
          // System.out.println();
          // printArray(emptyStringNumbers);
          // System.out.println();
          // printArray(emptyBoolNumbers);
          
          // int[] rando={1,2,3,4,5,6,7,8,9};
          // //make a loop that makes even numbers increase by 10
          // for(int i=1;i<rando.length;i+=2){
          //      rando[i]+=10;
          // }
          // printArray(rando);
          
          gpaCalculator();
     }

     private static void gpaCalculator(){
          //ask the user 5 grades
          Scanner sc = new Scanner(System.in);
          double[] grades = new double[5];
          for(int i=0;i<5;i++){
               double g = sc.nextDouble();
               grades[i]=g;
               //save them in an array
          }
          
          //print out the average of the 5 grades
          //average = sum of the list divided by the number of the list
          double sum=0.0;
          for(int i=0;i<5;i++){
               sum+=grades[i];
          }
          System.out.printf("\n%f",(sum/5));

          //print out the grades
          printArray(grades);

     }
     private static void printArray(int[] listy){
          for(int i=0;i<listy.length;i++){
               System.out.println(listy[i]);
          }
     }
     private static void printArray(double[] listy){
          for(int i=0;i<listy.length;i++){
               System.out.println(listy[i]);
          }
     }
     private static void printArray(String[] listy){
          for(int i=0;i<listy.length;i++){
               System.out.print(listy[i]);
          }
     }
     private static void printArray(boolean[] listy){
          for(int i=0;i<listy.length;i++){
               System.out.print(listy[i]);
          }
     }


}
