
public class String_check_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�ж����ַ����Ƿ���� str.indexOf();���ڴ��ڵ���0�������ڵ���-1
		String str1 ="8888";
		String str2 ="B888";
		
		if (str1.indexOf("8") > -1) {
			System.out.println("str1�����ַ���8��");
		}
		
		if (str1.indexOf("8") == -1) {
			System.out.println("str1�������ַ���8");
		}
		
		
		if (str2.indexOf("B") > -1) {
			System.out.println("str2�����ַ���B��");
		}
		

	}

}
