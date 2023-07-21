import java.util.*;
class voweltoupper{
 
public static void conVowUpp(char[] str)
{
  int N = str.length;
 
  for (int i = 0; i < N; i++)
  {
    if (str[i] == 'a' || str[i] == 'e' ||str[i] == 'i' || str[i] == 'o' ||
        str[i] == 'u')
    {
      char c = Character.toUpperCase(str[i]);
      str[i] = c;
    }
  }
  for(char c : str)
    System.out.print(c);
}
public static void main(String[] args)
{
  String str = "hi how are you";
  conVowUpp(str.toCharArray());
}
}