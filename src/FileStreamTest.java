import java.io.*;

public class FileStreamTest {

	public static void main(String[] args) {
		try 
		{	
			File f = new File("/home/codex/Desktop/file-handling/src/text/files/byte_array.txt");
			byte[] bWrite  = {11, 24, 3, 25, 30};
			OutputStream out = new FileOutputStream(f);
			
			for(int x = 0; x < bWrite.length; x++)
			{
				out.write(bWrite[x]);
			}
			out.close();
			
			InputStream in = new FileInputStream(f);
			
			int size = in.available();
			
			for(int i = 0; i < size; i++)
			{
				System.out.println((char)in.read() + " ");
			}
			
			in.close();
					
		} catch(Exception e)
		{
			System.out.println("error");
		}

	}

}
