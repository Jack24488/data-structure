package admin;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class Homework {
	public static void main(String[] args) {
		int n=0;
	    File file=new File("word.txt"); //创建文件对象
	    char a[]="今天中午吃米饭".toCharArray(); 
	    try {
	    	for(int i=0;i<a.length;i++) {  //对字符数组进行异或
	    		a[i]=(char)(a[i]^'A'); //每个值与字符A异或
	    	}
	    	FileWriter w=new FileWriter(file); 
	    	w.write(a,0,a.length); //利用输出流把a数组写到文件中
	    	w.close(); 
	    	FileReader r=new FileReader(file); //创建输入流
	    	char b[]=new char[a.length]; //创建和数组a等长的字节数组b，用于存放从输入流中读到的值
	    	while(( n=r.read(b))!=-1) {  //此处已经把文件中的内容读入数组
	    		String c=new String(b);  //把字节数组转化为字符串
	    		System.out.println("加密后：   "+c);//输出加密后的值
	    	}
	    	r.close(); //关闭流
	    	for(int i=0;i<b.length;i++) {  
	    		b[i]=(char)(b[i]^'A');  
	    	}
	    	String d=new String(b);
	    	System.out.println("解密后：   "+d);//输出解密后的值
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	
	}
}
