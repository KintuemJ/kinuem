package shangguiguday03;
/**
 * һ�������ǡ�õ���������֮�ͣ�������ͳ�Ϊ��������,�ҳ�1000���ڵ�����
 * @author Administrator
 *
 */
public class TestWanShu {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int factor = 0;
		for(int i=1;i<=1000;i++){
			//ÿִ��һ������ѭ�����ͻὫi�����������ۼӵ�factor��
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
