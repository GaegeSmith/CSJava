
public class TimeLoop {
    public static void main(String[] args) {
        //time start
        long tStart = System.currentTimeMillis();

        // counter(1000000);
        counter(Long.MAX_VALUE);

        
        //time finish
        long tFinish = System.currentTimeMillis();
        
        //difference between tStart and tFinish
        System.out.println((tFinish-tStart)+(" ms"));
        System.out.println((tFinish-tStart)/1000+" s");

    
    }

    private static void counter(long x) {
        System.out.println("Loop started ");
        for (long i=0; i<x; i++) {
            System.out.println(i);  //comment this to not print
        }
        System.out.println("Loop finished ");

        System.out.println("Loop started ");
        long i=0;
        while ( i < x ) {
            System.out.println(i);  //comment this to not print
            i++;
        }
        System.out.println("Loop finished ");
    }
}
