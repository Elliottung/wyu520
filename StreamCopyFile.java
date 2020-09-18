import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamCopyFile {
	
	public static void copyFile(String oldPath, String newPath) throws IOException {
		FileInputStream fis = new FileInputStream(oldPath);//�����ļ���
		File file = new File(newPath);
		if(!file.exists()) {//����ļ�������
			file.createNewFile();//��newһ�����ļ�
			FileOutputStream fos =new FileOutputStream(file);//����ļ������������ļ�
			
			int length;
			byte buffer[]=new byte[1024];
			 while((length=fis.read(buffer))!=-1) {
				 for(int i=0; i < length; i++) {
					 fos.write(buffer[i]);
				 }
			 }
			//�ر���
			 fos.close();
			 fis.close();
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		String oldFile ="D:\\�ļ�������\\myfile.txt";
		String newFile ="D:\\�ļ�������\\myfile_cp.txt ";
		copyFile(oldFile, newFile);//�����ļ�
		System.out.println("---�ļ����Ƴɹ�---");
		
		
		
		
	}
}
