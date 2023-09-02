import java.io.*;

class Palindromo 
{  
  public static boolean isPali(String input) 
  {
    boolean resp = true;
	char space =' ';
	if(input.length()==1)
	{
		resp=true;
		return resp;
	}
	else if(input.length()<=0)
	{
		return false;
	}

    for (int i = 0, j = (input.length() -1); i < (input.length() / 2); i++, j--)
    {
	   while(!Character.isLetter(input.charAt(j)))
	   {
		   j--;
	   }	  
	   while(!Character.isLetter(input.charAt(i)))	   
	   {
		   i++;
	   }	
       if (input.charAt(i) != input.charAt(j)) 
	   {
		  resp=false;
          i = input.length();
          j = 0;
	   }
    } 
   
    return resp;
  }

  public static boolean isFim(String buffer)
  {
  	  if(buffer.charAt(0)=='F' && buffer.charAt(1)=='I' && buffer.charAt(2)=='M')
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
  }

  public static void isPaliPrint(String line)
  {
		if(Palindromo.isPali(line))
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

	while(!(Palindromo.isFim(line)))
	{
		Palindromo.isPaliPrint(line);
					
    	line = buffer.readLine();

  	}
  }
}

