package etc.api.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamCopy {

	public static void main(String[] args) {
		
		FileInputStream oldFile = null;
		FileOutputStream newFile = null;
		
		
		try {
			oldFile = new FileInputStream("C:/MyWork/img(kakao).png");			
			newFile =new FileOutputStream("C:\\Users\\ICT04_06\\Desktop\\copy.png"); 
			
			byte[]arr = new byte[100];
			
			while(true) {
				int result = oldFile.read(arr);
				if(result == -1)break;
				
				newFile.write(arr, 0, result);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}finally {
			try {
				oldFile.close();
				newFile.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
	}

}
