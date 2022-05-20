package sample_ex;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


public class sample03 {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		/*
		 * InputStream in = System.in;
		 * 
		 * byte[] a = new byte[3]; in.read(a);
		 * 
		 * System.out.println(a[0]); System.out.println(a[1]); System.out.println(a[2]);
		 * 
		 * 
		 * InputStreamReader reader = new InputStreamReader(in); char[] char_a = new
		 * char[3]; reader.read(char_a);
		 * 
		 * System.out.println(char_a);
		 * 
		 * BufferedReader br = new BufferedReader(reader);
		 * 
		 * String br_a = br.readLine(); System.out.println(br_a);
		 * 
		 * Scanner sc = new Scanner(System.in); System.out.println(sc.next());
		 * //next-단어, nextLine-라인, nextInt-정수 //System.err도 있는데 System.out과 동일한 역할을 한다.
		 * 다만 System.err는 오류메시지를 출력할 경우에 사용한다.
		 * 
		 * // 파일 쓰기 // FileOutputStream, FileWriter, PrintWriter, 파일에 내용 추가하기, 파일 읽기
		 */
		
		   //FileOutputStream
	        FileOutputStream output = new FileOutputStream("C://Temp/sample3.txt");
	        
	        for(int i=1; i<11; i++) {
	            String data = i+" 번째 줄입니다.\r\n"; 
	            output.write(data.getBytes());
	        }
	        
			/*
			 * FileOutputStream에 값을 쓸 때는 byte배열로 써야 하므로 위와같이 String을 byte배열로 바꾸어 주는
			 * getBytes() 메서드를 이용했다. \r\n은 줄바꿈 문자이다.
			 */
	        output.close();
	        
	        //FileWriter
	        FileWriter fw = new FileWriter("C://temp/sample4.txt");
	        for(int i=1; i<11; i++) {
	            String data = i+" 번째 줄입니다.\r\n";
	            fw.write(data);
	        }
	        fw.close();
	        
	        //PrintWriter
	        PrintWriter pw = new PrintWriter("C://temp/sample5.txt");
	        for(int i=1; i<11; i++) {
	            String data = i+" 번째 줄입니다.";
	            pw.println(data);
	        }
	        pw.close();
	        
	        PrintWriter pw2 = new PrintWriter(new FileWriter("C://temp/sample5.txt", true));
	        // FileWriter대신 PrintWriter를 이용하고 싶은 경우에는 다음과 같이 변경해야 한다.
	        for(int i=11; i<21; i++) {
	            String data = i+" 번째 줄입니다.";
	            pw2.println(data);
	        }
	        pw2.close();
	        
	        
	        for(int i=1; i<11; i++) {
	            String data = i+" 번째 줄입니다.";
	            System.out.println(data);
	        }
	        
	        //파일에 내용 추가하기
	        FileWriter fw2 = new FileWriter("C://temp/sample5.txt", true);  // 파일을 추가 모드로 연다.
	        for(int i=11; i<21; i++) {
	            String data = i+" python번째 줄입니다.\r\n";
	            fw2.write(data);
	        }
	        fw2.close();
	        
	        byte[] b = new byte[1024];
	        FileInputStream input = new FileInputStream("C://temp/sample5.txt");
	        input.read(b);
	        System.out.println(new String(b));  // byte 배열을 문자열로 변경하여 출력
	        input.close();
	        
	        //파일을 라인단위로 읽을 수 있다면 훨씬 편리할 것이다. 다음과 같이 예제를 수정
	        
	        BufferedReader br = new BufferedReader(new FileReader("C://temp/sample5.txt"));
	        while(true) {
	            String line = br.readLine();
	            if (line==null) break;  // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
	            System.out.println(line);
	        }
	        br.close();
	        
			/*
			 * FileInputStream 대신 FileReader와 BufferedReader의 조합을 사용하면 라인단위로 파일을 읽을 수 있다.
			 * BufferedReader의 readLine 메소드는 더이상 읽을 라인이 없을 경우 null을 리턴
			 */
	        FileWriter fw3 = new FileWriter("C://temp/sample.txt");
	        fw3.write("Write once, run anywhere");
	        fw3.close();
	        BufferedReader br2 = new BufferedReader(new FileReader("C://temp/sample.txt"));
	        String line = br2.readLine();
	        System.out.println(line);  // null 이 출력된다.
	        br2.close();
	        
	     // 줄 단위로 읽으면 줄바꿈 문자가 없어지므로 줄바꿈 문자를 포함한다. 
	        ArrayList<String> data21 = new ArrayList<>();
	        BufferedReader br1 = new BufferedReader(new FileReader("C://temp/sample5.txt"));
	        while(true) {
	            String line1 = br1.readLine();
	            if (line1==null) break;
	            data21.add(line1);
	        }
	        br1.close();
	        String text = String.join("\n", data21); 

	        // python 이라는 단어를 java로 변경한다.
	        text = text.replaceAll("python", "java");

	        // 변경된 내용을 다시 파일에 적는다.
	        FileWriter fw1 = new FileWriter("C://temp/sample.txt");
	        fw1.write(text);
	        fw1.close();
	        

	        
 	}

}
