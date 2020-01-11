/**
 * 去除字符串中的空白
 * @author Kintuem
 *
 */
public class String_removeSpace_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		去除首尾空格
		String a = "   a   ";
		System.out.println("["+a+"]");
		String shortStr = a.trim();
		System.out.println("["+shortStr+"]");
		
//		去除所有的空格:利用正则表达式"\\s"
		String str = "  ab  cd efg            h";
		String strB = str.replaceAll("\\s","");
		System.out.println(strB);

	}

}
