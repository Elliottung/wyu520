package day04;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class WriterDemo1 {
public static void main(String[] args )throws IOException {
	//���ļ�����д����
	File f = new File("D:\\aaa\\1" + File.separator +"1U.txt");
	Writer out = new FileWriter(f);
	
	String[] strs = new String[] {"I","  ","RULE","  ","THE","  ","WORLD","  ","!"};
	for(int i = 0; i < strs.length; i++)
	out.write(strs[i]);
	out.close();
	
	//���ļ����ж�ȡ����
	Reader reader = new FileReader(f);//����ָ���ļ����ַ�����ȡ��
	char ch[] = new char[1024];//����ָ���ļ����ж�ȡ�������ݴ�ŵ��ַ����鵱��
	int len = reader.read(ch);//���ļ����е����ݶ�ȡ���ֽ����鵱�в���������ȡ���ֽ�����ĳ���
	reader.close();//�ر��ַ��������
	System.out.println("����Ϊ��" + new String(ch,0,len));
}
}
