
public class General_type_format_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�������͸�ʽ��
		System.out.println(String.format("��ĸx�Ĵ�д��%c", 'X'));
		System.out.println(String.format("1251+3950�Ľ����%d", 1251 + 3950));
		System.out.println(String.format("��ȡ��λС���㣺%2f", Math.PI));
		System.out.println(String.format("2<3�Ľ����%b", 2 < 3));
		System.out.println(String.format("1200000.1�ÿ�ѧ��������ʾ��%e", 1200000.1));
		System.out.println(String.format("�������%d%%����к�%d%%�ĺ�ˮ", 1, 99));

	}

}
