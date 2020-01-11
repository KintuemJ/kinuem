package shangguiguday03;
/*
 100以内所有的质数
 */
public class TestPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag =false;
		long start = System.currentTimeMillis();
		for(int i=2;i<100000;i++) {//实现100以内的自然数的遍历
			//如何判断i是否为一个质数/素数
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i % j==0) {
					flag =true;
					break;
				}
			}
			if(flag ==false) {
				System.out.println(i);
			}
			flag = false;
			}
		long end = System.currentTimeMillis();
		System.out.println("找到所有的质数消耗的时间为（ms）:"+(end - start));
//		17342--加上break：1704--加上根号i:85

	}

}
