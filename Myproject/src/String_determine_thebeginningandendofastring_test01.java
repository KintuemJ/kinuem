
public class String_determine_thebeginningandendofastring_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ʹ��endswith����������Ҫ�Աȵ��ַ������ɷ����Ĳ���������boolֵ
//		���ļ���ת�����ַ�������ʽPS��String fileName ="HelloWorld.java";
//		public boolean endsWith(String suffix)
		
		String str1 = "helloworld.java";
		Boolean bool1 = str1.endsWith(".java");
		Boolean bool2 = str1.endsWith(".jpg");
		System.out.println("bool1 = "+bool1);
		System.out.println("bool2 = "+bool2);

		String str2  =  "����һֻСС��";
		Boolean bool3 = str2.startsWith("����");
		Boolean bool4 = str2.startsWith("���Ƕ�");
		System.out.println("bool3 = "+bool3);
		System.out.println("bool4 = "+bool4);
	}

}
