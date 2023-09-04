import java.io.*;
import java.util.*;

class Alteracao_Aleatoria
{

    public static String alt_Line(String line)
    {
        Random gerador = new Random();
        gerador.setSeed(4);
        char[] auxline=new char[line.length()];
        auxline=line.toCharArray();
        char a, b;

        do
        {
          a=(char) ((gerador.nextInt()%26)+'a');
        }while(!Character.isLetter(a));

        do
        {
          b=(char) ((gerador.nextInt()%26)+'a');
        }while(!Character.isLetter(b));

        for(int i=0; i<line.length(); i++)
        {
            if(auxline[i]==a)
            {
                auxline[i]=b;
            }
        }
        String auxlineb= new String(auxline);

        return auxlineb;
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

    public static void main(String[] args) throws IOException
    {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        
        String line= new String(buffer.readLine());

        while(!isFim(line))
        {
            line=alt_Line(line);

            System.out.println(line);    

            line=buffer.readLine();
        }
        
    }
}
