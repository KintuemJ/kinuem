
public class String_equals_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//�ж��ַ����Ƿ����/==�Աȵ����ڴ��ַ/equals�Աȵ���String��������
		String name = new String("abc");
		String dbvalue = new String("abc");
		System.out.println(name == dbvalue);
		System.out.println(name.equals(dbvalue));
		
//		���Դ�Сд�Ƚ�
		String str1 = new String("ABC");
		System.out.println(name.equals(str1));
		System.out.println(name.equalsIgnoreCase(str1));
		
//		�������
		String a ="bcd";
		String b = "bcd";
		System.out.println(a==b);
		
		
		
	}

}
