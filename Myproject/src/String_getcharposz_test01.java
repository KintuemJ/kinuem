/**
 * 获取指定索引位置的字符
 * @author Kintuem
 *
 */
public class String_getcharposz_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		获取索引位置为0的字符     语法：public char charAt(int index)
		String a = "Peter";
		char ch =a.charAt(0);
		System.out.println(ch);
//		获取子字符串位置的方法：获取字符串中xxx正数第一次出现的索引位置
//		public int indexof(String str)
		String str = "we are the world!";
		int index = str.indexOf("e");
		System.out.println(index);
		
//		获取子字符串位置的方法：从起始位置开始，获取字符串中xxx正数第一次出现的索引位置
//		public int indexof(String str,intfromIndex)
		String str1 = "we are the world!";
		int index1 = str.indexOf("e",2);
		System.out.println(index1);

//		获取子字符串位置的方法：获取字符串中xxx倒数第一次出现的索引位置
//		public int indexof(String str)
		String str2 = "we are the world!";
		int index2 = str.lastIndexOf("e");
		System.out.println(index2);
		
//		获取子字符串位置的方法：从起始位置开始，获取字符串中xxx数第一次出现的索引位置
//		public int indexof(String str,intfromIndex)
		String str3 = "we are the world!";
		int index3 = str.lastIndexOf("e",10);
		System.out.println(index3);

	}

}
