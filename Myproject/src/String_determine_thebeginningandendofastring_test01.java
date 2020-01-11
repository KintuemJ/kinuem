
public class String_determine_thebeginningandendofastring_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		使用endswith方法将我们要对比的字符串当成方法的参数，返回bool值
//		将文件名转换成字符串的形式PS：String fileName ="HelloWorld.java";
//		public boolean endsWith(String suffix)
		
		String str1 = "helloworld.java";
		Boolean bool1 = str1.endsWith(".java");
		Boolean bool2 = str1.endsWith(".jpg");
		System.out.println("bool1 = "+bool1);
		System.out.println("bool2 = "+bool2);

		String str2  =  "我是一只小小鸟；";
		Boolean bool3 = str2.startsWith("我是");
		Boolean bool4 = str2.startsWith("我是二");
		System.out.println("bool3 = "+bool3);
		System.out.println("bool4 = "+bool4);
	}

}
