// Exercise10_2.java: Read scores from a text file and use
// StringTokenizer to extract numbers from the string
import java.io.*;
import java.util.StringTokenizer;

public class Exercise10_2 {
  public static void main(String args[]) {
    double sum = 0;
    int count = 0;
    
    try {
      // Create file input stream
      BufferedReader in = new BufferedReader(
        new FileReader("d:\\00\\data1.txt"));

      String line;
      while ((line = in.readLine()) != null) {
        StringTokenizer st = new StringTokenizer(line);
        while (st.hasMoreTokens()) {
          sum += Double.parseDouble(st.nextToken());
          count++;
        }        
      }
      
      // Display result
      System.out.println("The sum is " + sum);
      System.out.println("The average is " + sum / count);
      
    }
    catch (IOException ex) {
      System.out.println(ex);
    }
  }
}