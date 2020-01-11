package shangguiguday03;
/*
 1*1=1
 1*2=2 2*2=4
 ...
 9*1=9 ...   9*9=81
 */
public class TestJiuJiu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {//一共有i行
			for(int j=1;j<=i;j++) {//每行有i个等式
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}
