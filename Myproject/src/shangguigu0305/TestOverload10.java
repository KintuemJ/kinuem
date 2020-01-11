package shangguigu0305;


/*
 * 方法的重载（overload）
 * 要求：1、同一类中 2、方法名必须相同 3、方法的参数列表不同（①参数的个数不同 ②参数类型不同）
 * 补充：方法的重载与方法的返回值没有关系
 */
public class TestOverload10 {

	
	
class Overload{
	//定义两个int类型变量的和
	public int getSum(int i,int j) {
		return i+j;
	}
	
	//定义第三个int类型变量的和
	public int  getSum(int i,int j,int k) {
		return i+j+k;
		
	}
	
	//定义两个double类型变量的和
	public double getSum(double i,double j) {
		return i + j;
	}
	
	
}
}
