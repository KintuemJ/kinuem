
public class String_replace_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�滻�ַ���
//	replace()��replaceAll()��replaceFirst(�滻һ��)
//	public String replace(CharSequence target,CharSequence replacement)

		String str1 = "��ͷһ��һ��";
		String str2 = str1.replace("һ", "Ҽ");
		System.out.println(str2);
		
	
		String str3 = str1.replaceAll(str1, "һ");
		System.out.println(str3);
	}

}
