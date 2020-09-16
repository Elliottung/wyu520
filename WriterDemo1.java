package day04;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class WriterDemo1 {
public static void main(String[] args )throws IOException {
	//对文件进行写操作
	File f = new File("D:\\aaa\\1" + File.separator +"1U.txt");
	Writer out = new FileWriter(f);
	
	String[] strs = new String[] {"I","  ","RULE","  ","THE","  ","WORLD","  ","!"};
	for(int i = 0; i < strs.length; i++)
	out.write(strs[i]);
	out.close();
	
	//对文件进行读取操作
	Reader reader = new FileReader(f);//创建指定文件的字符串读取流
	char ch[] = new char[1024];//将从指定文件当中读取到的数据存放到字符数组当中
	int len = reader.read(ch);//将文件当中的内容读取到字节数组当中并返回所读取的字节数组的长度
	reader.close();//关闭字符串输出流
	System.out.println("内容为：" + new String(ch,0,len));
}
}
