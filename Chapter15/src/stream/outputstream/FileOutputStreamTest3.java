package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {

	public static void main(String[] args) {
		 
		try(FileOutputStream fos = new FileOutputStream("output3.txt"))
		{
		
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i = 0; i < bs.length; i++){
				bs[i] = data;
				data++;
			}
			fos.write(bs, 2, 10);
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
