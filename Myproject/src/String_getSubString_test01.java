/**
 * 获取子字符串
 * @author Kintuem
 *
 */
public class String_getSubString_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		截取字符：从开始位置截取
//		语法：public String subString(int beginIndex)
		String str = "0123456789109876543";
		String a =str.substring(3);
		System.out.println(a);
		
		
//		范围截取字符：从开始位置截取到最后位置之前的字符
//		语法：public String subString(int beginIndex,int endIndex)
		String str1 = "0123456789109876543";
		String a1 =str.substring(3,9);
		System.out.println(a1);
	}

}
