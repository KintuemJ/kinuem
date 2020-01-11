
public class General_type_format_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		常规类型格式化
		System.out.println(String.format("字母x的大写：%c", 'X'));
		System.out.println(String.format("1251+3950的结果：%d", 1251 + 3950));
		System.out.println(String.format("Π取两位小数点：%2f", Math.PI));
		System.out.println(String.format("2<3的结果：%b", 2 < 3));
		System.out.println(String.format("1200000.1用科学计数法表示：%e", 1200000.1));
		System.out.println(String.format("天才是由%d%%的灵感和%d%%的汗水", 1, 99));

	}

}
