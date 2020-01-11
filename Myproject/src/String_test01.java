public class String_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		引用字符串常量
		String a = "123";
		System.out.println(a);

		String b = "1234", c = "124455";
		System.out.println(b);
		System.out.println(c);

		String str1, str2;
		str1 = "时间就是金钱";
		str2 = "时间就是一切";
		System.out.println(str1);
		System.out.println(str2);

//		利用构造方法直接实例化字符串
		String d = new String("wo ai xiaosongshu!");
		String e = new String(d);
		String f = d;
		System.out.println(e);
		System.out.println(f);

//		利用字符数组实例化
		char[] charArray = { '时', '间', '就', '是', '金', '钱' };
		String g = new String(charArray, 4, 2);
		System.out.println(g);

//		利用字节数组实例化
		byte[] byteArray = { -60, -6, -70, -61 };
		String h = new String(byteArray);
		System.out.println(h);

	}
}
