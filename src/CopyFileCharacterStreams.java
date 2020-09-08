import java.io.*;

public class CopyFileCharacterStreams 
{
	public static void main(String[] args) throws IOException
	{
		FileReader in = null;
		FileWriter out = null;
		
		try
		{
			in = new FileReader("/home/codex/Desktop/file-handling/src/text/files/input.txt");
			out = new FileWriter("/home/codex/Desktop/file-handling/src/text/files/output.txt");
			
			int c;
			
			while((c = in.read()) != -1)
			{
				out.write(c);
			}
		} finally
		{
	         if (in != null) 
	         {
	             in.close();
	          }
	          if (out != null)
	          {
	             out.close();
	          }
		}
	}
}
