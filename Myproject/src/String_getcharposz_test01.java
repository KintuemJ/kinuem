/**
 * ��ȡָ������λ�õ��ַ�
 * @author Kintuem
 *
 */
public class String_getcharposz_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		��ȡ����λ��Ϊ0���ַ�     �﷨��public char charAt(int index)
		String a = "Peter";
		char ch =a.charAt(0);
		System.out.println(ch);
//		��ȡ���ַ���λ�õķ�������ȡ�ַ�����xxx������һ�γ��ֵ�����λ��
//		public int indexof(String str)
		String str = "we are the world!";
		int index = str.indexOf("e");
		System.out.println(index);
		
//		��ȡ���ַ���λ�õķ���������ʼλ�ÿ�ʼ����ȡ�ַ�����xxx������һ�γ��ֵ�����λ��
//		public int indexof(String str,intfromIndex)
		String str1 = "we are the world!";
		int index1 = str.indexOf("e",2);
		System.out.println(index1);

//		��ȡ���ַ���λ�õķ�������ȡ�ַ�����xxx������һ�γ��ֵ�����λ��
//		public int indexof(String str)
		String str2 = "we are the world!";
		int index2 = str.lastIndexOf("e");
		System.out.println(index2);
		
//		��ȡ���ַ���λ�õķ���������ʼλ�ÿ�ʼ����ȡ�ַ�����xxx����һ�γ��ֵ�����λ��
//		public int indexof(String str,intfromIndex)
		String str3 = "we are the world!";
		int index3 = str.lastIndexOf("e",10);
		System.out.println(index3);

	}

}
