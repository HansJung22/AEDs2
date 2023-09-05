import java.io.*;

class PalindromoRec
{  
  public static boolean isPali(String input) 
  {
    if (input.length() == 1) {
      return true;
    }

    return isPaliRecursive(input, 0, input.length() - 1);
  }

  private static boolean isPaliRecursive(String input, int left, int right) 
  {
    if (left >= right) {
      return true;
    }

    char leftChar = input.charAt(left);
    char rightChar = input.charAt(right);

    if (!Character.isLetter(leftChar)) {
      return isPaliRecursive(input, left + 1, right);
    }

    if (!Character.isLetter(rightChar)) {
      return isPaliRecursive(input, left, right - 1);
    }

    if (leftChar != rightChar) {
      return false;
    }

    return isPaliRecursive(input, left + 1, right - 1);
  }

  public static boolean isFim(String buffer)
  {
    return buffer.startsWith("FIM");
  }

  public static void isPaliPrint(String line)
  {
    if (PalindromoRec.isPali(line))
    {
      System.out.println("SIM");    
    }
    else
    {
      System.out.println("NAO");    
    }
  }
  
  public static void main(String[] args) throws IOException 
  {
    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    
    String line = buffer.readLine();

    while (!isFim(line))
    {
      PalindromoRec.isPaliPrint(line);
      line = buffer.readLine();
    }
  }
}
