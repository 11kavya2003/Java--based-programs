import java.io.*;
 class ForEach2d {
  public static void main(String args[]) {
   
    int nums[][] = new int[3][5];

    for (int i = 0; i < 3; i++)
      for (int j = 0; j < 5; j++)
       
    for (int x[] : nums)
 {
      for (int y : x)
 {
        System.out.println("Value is: " + y);
      
      }
    }
    //System.out.println(x);
  }
}
