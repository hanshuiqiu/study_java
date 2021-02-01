package JAVA.异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 文件复制工具类
 * @author Administrator
 */
public class FileUtils {

	public void testCopy() throws CopyException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {  //添加异常处理机制
			fis = new FileInputStream("fos.dat");
			fos = new FileOutputStream("fos_copy4.dat");
			int d = -1;
			while ((d = fis.read()) != -1) {
				fos.write(d);
			}
			System.out.println("复制完毕");
		} catch (FileNotFoundException e) {  //若找不到文件则抛该异常
            throw new CopyException("文件没有找到",e); //抛出自定义异常,屏蔽底层的IOException即不执行往后的父异常IOException里面的代码
		} catch (IOException e) {
			System.err.println("读写异常");
			e.printStackTrace();
		} finally {  //释放系统资源
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}

/**
 * 自定义异常
 */
class CopyException extends Exception {
	
	public CopyException() {
		super();
	}

	public CopyException(String message) {
		super(message);
	}

	public CopyException(Throwable cause) {
		super(cause);
	}
	
	public CopyException(String message, Throwable cause) {
		super(message, cause);
	}
	
}
