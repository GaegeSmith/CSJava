public class MediaPlayer {
     public static void main(String[] args) {
          Songs[] things = new Songs[5];
          for (int i = 0; i < things.length; i++) {
               things[i] = new Songs();
          }
          Songs s1 = new Songs();
          //call the parameters of an object
          System.out.println(s1.title);
          System.out.println(s1.artist);
          
          // Songs s2 = new Songs("funky town","lipps inc");
          // //call the parameters of an object
          // System.out.println(s2.title);
          // System.out.println(s2.artist);

          // Songs s3 = new Songs("creature","half alive");
          // System.out.println(s3.title);
          // System.out.println(s3.artist);

          // s3.setTitle("song2");  //correct way to reset a variable
          // System.out.println(s3.title);
          // s3.title="too steep";  //not correct way to reset a variable
          // System.out.println(s3.title);

          System.out.println(s1.getTitle()); //correct way to obtain obj parameters
          System.out.println(s1.getArtist());
          System.out.println(s1.getRating());
          



     }
}
