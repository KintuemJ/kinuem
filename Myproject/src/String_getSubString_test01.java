/**
 * ��ȡ���ַ���
 * @author Kintuem
 *
 */
public class String_getSubString_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		��ȡ�ַ����ӿ�ʼλ�ý�ȡ
//		�﷨��public String subString(int beginIndex)
		String str = "0123456789109876543";
		String a =str.substring(3);
		System.out.println(a);
		
		
//		��Χ��ȡ�ַ����ӿ�ʼλ�ý�ȡ�����λ��֮ǰ���ַ�
//		�﷨��public String subString(int beginIndex,int endIndex)
		String str1 = "0123456789109876543";
		String a1 =str.substring(3,9);
		System.out.println(a1);
	}

}
