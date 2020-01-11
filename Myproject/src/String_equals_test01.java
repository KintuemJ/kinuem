
public class String_equals_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//判断字符串是否相等/==对比的是内存地址/equals对比的是String对象内容
		String name = new String("abc");
		String dbvalue = new String("abc");
		System.out.println(name == dbvalue);
		System.out.println(name.equals(dbvalue));
		
//		忽略大小写比较
		String str1 = new String("ABC");
		System.out.println(name.equals(str1));
		System.out.println(name.equalsIgnoreCase(str1));
		
//		特殊情况
		String a ="bcd";
		String b = "bcd";
		System.out.println(a==b);
		
		
		
	}

}
