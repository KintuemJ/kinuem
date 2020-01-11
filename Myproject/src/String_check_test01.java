
public class String_check_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		判断子字符串是否存在 str.indexOf();存在大于等于0，不存在等于-1
		String str1 ="8888";
		String str2 ="B888";
		
		if (str1.indexOf("8") > -1) {
			System.out.println("str1包含字符“8”");
		}
		
		if (str1.indexOf("8") == -1) {
			System.out.println("str1不包含字符“8");
		}
		
		
		if (str2.indexOf("B") > -1) {
			System.out.println("str2包含字符“B”");
		}
		

	}

}
