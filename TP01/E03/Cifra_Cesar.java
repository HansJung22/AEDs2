import java.io.*;

class Cifra_Cesar
{
	public static char cifrar(char car)
	{
		if((car>='x'&& car<='z') || (car>='X'&& car<='Z') )
		{
			car=(char) (car-23);
		}
		else if((car>='a'&& car<='z') || (car>='A'&& car<='Z'))
		{
			car=(char) (car+3);
		}
		else
		{}

		return car;
	}

	public static String codificar(String line)
	{
		char[] aux = new char[line.length()];

		for(int i=0; i<line.length(); i++)
		{
			aux[i]=Cifra_Cesar.cifrar(line.charAt(i));
		}

		String strAux = new String(aux);

		return strAux;
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
		BufferedReader buffer= new BufferedReader(new InputStreamReader(System.in));
		String line = buffer.readLine();
		
		while(!Cifra_Cesar.isFim(line))
		{
			line = Cifra_Cesar.codificar(line);
			System.out.println(line);

			line = buffer.readLine();


		}
	}
}
