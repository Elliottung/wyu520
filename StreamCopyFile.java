import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamCopyFile {
	
	public static void copyFile(String oldPath, String newPath) throws IOException {
		FileInputStream fis = new FileInputStream(oldPath);//输入文件流
		File file = new File(newPath);
		if(!file.exists()) {//如果文件不存在
			file.createNewFile();//则new一个新文件
			FileOutputStream fos =new FileOutputStream(file);//输出文件流来接收新文件
			
			int length;
			byte buffer[]=new byte[1024];
			 while((length=fis.read(buffer))!=-1) {
				 for(int i=0; i < length; i++) {
					 fos.write(buffer[i]);
				 }
			 }
			//关闭流
			 fos.close();
			 fis.close();
		}
		
	}
	
	
	public static void main(String[] args) throws IOException {
		String oldFile ="D:\\文件流复制\\myfile.txt";
		String newFile ="D:\\文件流复制\\myfile_cp.txt ";
		copyFile(oldFile, newFile);//复制文件
		System.out.println("---文件复制成功---");
		
		
		
		
	}
}
