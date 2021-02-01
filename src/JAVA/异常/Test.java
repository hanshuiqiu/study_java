package JAVA.异常;

public class Test {

	public static void main(String[] args) throws Exception {

		//测试常见的运行时异常
//		testNullPointerException();
		
//		testArrayIndexOutOfBoundsException();
		
//		testArithmeticException();
		
//		testClassCastException();
		
//		testNumberFormatException();
		
		
	}
	
	/**
	 * 测试空指针异常
	 */
	public static void testNullPointerException(){ 
		try {
			String str = null;
	        System.out.println(str.length()); 
		} catch (Exception e) {
			System.out.println("\n空指针异常!");
			e.printStackTrace();  //输出堆栈跟踪信息
			System.out.println("\n"+e.toString());   //输出异常事件信息
			System.out.println("\n"+e.getMessage()); //输出异常产生原因
		}
    }
	
	/**
	 * 数组下标越界异常
	 */
	public static void testArrayIndexOutOfBoundsException(){
		try {
			int[] arr = new int[]{1,2,3};
	        System.out.println(arr[arr.length]);
		} catch (Exception e) {
			System.out.println("\n数组下标越界异常");
			e.printStackTrace();
		}
    }
	
	/**
	 * 数学异常
	 */
	public static void testArithmeticException(){
		try {
			System.out.println(5/0); 
		} catch (Exception e) {
			System.out.println("\n数学异常");
			e.printStackTrace();
		}
    }
	
	/**
	 * 强制类型转换异常
	 */
	public static void testClassCastException(){
		try {
			Object obj = "hello";
			Integer i = (Integer) obj; 
		} catch (Exception e) {
			System.out.println("\n强制类型转换异常");
			e.printStackTrace();
		}
    }
	
	/**
	 * 数字格式异常
	 */
	public static void testNumberFormatException(){
		try {
			int num = Integer.parseInt("a");
		} catch (Exception e) {
			System.out.println("\n数字格式异常");
			e.printStackTrace();
		}
        
    }

}
