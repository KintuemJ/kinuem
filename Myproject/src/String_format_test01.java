import java.util.Date;

public class String_format_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String.format  ��ʽ���ַ���         ���ں�ʱ���ַ�����ʽ��
//		String.format(String format,Object...args)
		Date date = new Date();
		String str = String.format("%tF", date);
		System.out.println(date);
		System.out.println(str);
		
		System.out.println();

		String year = String.format("%tY", date);
		String month = String.format("%tB", date);
		String day = String.format("%td", date);
		System.out.println("�����ǣ�"+year+"��");
		System.out.println("�����ǣ�"+month);
		System.out.println("�����ǣ�"+day+"��");
		
		System.out.println();

		String hour = String.format("%tH", date);
		String min = String.format("%tM", date);
		String second = String.format("%tS", date);
		System.out.println("�����ǣ�"+hour+"ʱ"+min+"��"+second+"��");
		
		System.out.println();

		String str1 = String.format("%tF", date);
		System.out.println("tF��ʽ��"+str1);
		
		String str2 = String.format("%tD", date);
		System.out.println("tF��ʽ��"+str2);

		String str3 = String.format("%tc", date);
		System.out.println("tF��ʽ��"+str3);

		String str4 = String.format("%tr", date);
		System.out.println("tF��ʽ��"+str4);



	}

}
