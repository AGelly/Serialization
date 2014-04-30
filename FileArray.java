import java.io.*;

public class FileArray 
{
	
		public static void writeArray(String name, int[] num) throws IOException
		{
		FileOutputStream fstream = new FileOutputStream("Numbers.dat");
		DataOutputStream outputFile = new DataOutputStream(fstream);
		System.out.println("Writing...");
		for(int i = 0; i < num.length; i++)
		{
			outputFile.writeInt(num[i]);
		}
		outputFile.close();
		System.out.println("Done writing.");
		System.out.println(" ");
		}
		
		public static void readArray(String name, int[] num) throws IOException
		{
			FileInputStream fstream = new FileInputStream("Numbers.dat");
			DataInputStream inputFile = new DataInputStream(fstream);
			boolean endOfFile = false;
			System.out.println("Reading...");
			while (!endOfFile)
			{
				try
				{
					int number = inputFile.readInt();
					System.out.println(number + " ");
				}
				catch (EOFException e)
				{
					endOfFile = true;
				}
			}
			inputFile.close();
			System.out.println("Done reading.");
		}	
}
