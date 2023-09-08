package etc.api.io.buffered;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderEx {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br =null;
		
		try {
			fr = new FileReader("C:/MyWork/hello.txt");
			br = new BufferedReader(fr);
			
			//BufferedReader에는 readLine() 메서드가 있고
            //한 줄을 통째로 읽어서 String으로 리턴합니다.
            //더 이상 읽어들일 데이터가 없다면 null을 리턴.
			
			String str;
			while((str = br.readLine())!= null) {
				System.out.println(str);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();// close로 마무리를 해야지만 한 코드가 되기 때문에 
				// close는 무조건 마무리가 되는 코등!
				fr.close();
			
			} catch (Exception e) {
				e.printStackTrace();
		}
		}
	}
	}
