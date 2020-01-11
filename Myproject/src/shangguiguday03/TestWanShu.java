package shangguiguday03;
/**
 * 一个数如果恰好等于它因子之和，这个数就称为“完数”,找出1000以内的完数
 * @author Administrator
 *
 */
public class TestWanShu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factor = 0;
		for(int i=1;i<=1000;i++){
			//每执行一次如下循环，就会将i的所有因子累加到factor中
			for(int j=1;j<i;j++){
				if(i%j==0) {
					factor +=j;
				}
			}
			if (i == factor) {
				System.out.println(i);		
			}
			factor = 0;
		}
	}

}
