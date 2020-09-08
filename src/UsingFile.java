import java.io.*;

public class UsingFile 
{
	public static void main(String[] args) throws IOException
	{
		File f = null;
		FileInputStream in = null;
		
		try
		{
			f = new File("/home/codex/Desktop/file-handling/src/text/files/input.txt");
			in = new FileInputStream(f);
			
			int c;
			
			while((c = in.read()) != -1)
			{
				System.out.print((char)c);
			}
		}finally
		{
	        if (in != null) {
	            in.close();
		}
	}
}
}