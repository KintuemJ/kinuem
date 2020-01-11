
public class String_replace_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		替换字符串
//	replace()、replaceAll()、replaceFirst(替换一次)
//	public String replace(CharSequence target,CharSequence replacement)

		String str1 = "馒头一文一个";
		String str2 = str1.replace("一", "壹");
		System.out.println(str2);
		
	
		String str3 = str1.replaceAll(str1, "一");
		System.out.println(str3);
	}

}
