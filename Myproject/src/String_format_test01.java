import java.util.Date;

public class String_format_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String.format  格式化字符串         日期和时间字符串格式化
//		String.format(String format,Object...args)
		Date date = new Date();
		String str = String.format("%tF", date);
		System.out.println(date);
		System.out.println(str);
		
		System.out.println();

		String year = String.format("%tY", date);
		String month = String.format("%tB", date);
		String day = String.format("%td", date);
		System.out.println("今年是："+year+"年");
		System.out.println("现在是："+month);
		System.out.println("今天是："+day+"日");
		
		System.out.println();

		String hour = String.format("%tH", date);
		String min = String.format("%tM", date);
		String second = String.format("%tS", date);
		System.out.println("今年是："+hour+"时"+min+"分"+second+"秒");
		
		System.out.println();

		String str1 = String.format("%tF", date);
		System.out.println("tF格式："+str1);
		
		String str2 = String.format("%tD", date);
		System.out.println("tF格式："+str2);

		String str3 = String.format("%tc", date);
		System.out.println("tF格式："+str3);

		String str4 = String.format("%tr", date);
		System.out.println("tF格式："+str4);



	}

}
