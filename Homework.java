package admin;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
public class Homework {
	public static void main(String[] args) {
		int n=0;
	    File file=new File("word.txt"); //�����ļ�����
	    char a[]="����������׷�".toCharArray(); 
	    try {
	    	for(int i=0;i<a.length;i++) {  //���ַ�����������
	    		a[i]=(char)(a[i]^'A'); //ÿ��ֵ���ַ�A���
	    	}
	    	FileWriter w=new FileWriter(file); 
	    	w.write(a,0,a.length); //�����������a����д���ļ���
	    	w.close(); 
	    	FileReader r=new FileReader(file); //����������
	    	char b[]=new char[a.length]; //����������a�ȳ����ֽ�����b�����ڴ�Ŵ��������ж�����ֵ
	    	while(( n=r.read(b))!=-1) {  //�˴��Ѿ����ļ��е����ݶ�������
	    		String c=new String(b);  //���ֽ�����ת��Ϊ�ַ���
	    		System.out.println("���ܺ�   "+c);//������ܺ��ֵ
	    	}
	    	r.close(); //�ر���
	    	for(int i=0;i<b.length;i++) {  
	    		b[i]=(char)(b[i]^'A');  
	    	}
	    	String d=new String(b);
	    	System.out.println("���ܺ�   "+d);//������ܺ��ֵ
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	
	}
}
