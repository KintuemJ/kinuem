/**
 * ȥ���ַ����еĿհ�
 * @author Kintuem
 *
 */
public class String_removeSpace_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ȥ����β�ո�
		String a = "   a   ";
		System.out.println("["+a+"]");
		String shortStr = a.trim();
		System.out.println("["+shortStr+"]");
		
//		ȥ�����еĿո�:����������ʽ"\\s"
		String str = "  ab  cd efg            h";
		String strB = str.replaceAll("\\s","");
		System.out.println(strB);

	}

}
