import java.io.*;

class Palindromo 
{

  public static boolean IsPali(String input) 
  {
    boolean resp = true;

    for (int i = 0; i < input.length() / 2; i++) 
    {
      for (int j=input.length() - 1; j > input.length() / 2; j--) 
      {
        if (input.charAt(i) != input.charAt(j)) 
	{
          resp = false;
          i = input.length();
          j = 0;
        } 
      } 
    } 
    return resp;
  }
  
  public static void main(String[] paramArrayOfString) throws IOException 
  {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
    String str = bufferedReader.readLine();
    
    System.out.println("Line: " + str);
    
    System.out.println("palindromo ?: " + IsPali(str));
  }
}

