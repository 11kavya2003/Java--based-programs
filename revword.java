import java.util.*;
public class revword
 {
 public void reverseword(String str1)
 {
  String[] word = str1.split(" ");
  String revString = "";
  for (int i = 0; i < word.length; i++)
  {
   String w = word[i];
   String reverseWord = "";
   for (int j = w.length() - 1; j >= 0; j--)
   {
    reverseWord = reverseWord + w.charAt(j);
   }
   revString = revString + reverseWord + " ";
  }
  System.out.println(revString);
 }
 
 
 
 public static void main(String args[]) {
  revword obj = new revword();
  String StrGiven = "good morning";
  obj.reverseword(StrGiven);
 }
}
