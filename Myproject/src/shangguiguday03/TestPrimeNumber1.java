package shangguiguday03;
/*
 * 100000���ڵ�������ǩд��
 */
public class TestPrimeNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag =false;
		long start = System.currentTimeMillis();
		l:for(int i=2;i<100000;i++) {//ʵ��100���ڵ���Ȼ���ı���
			//����ж�i�Ƿ�Ϊһ������/����
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i % j==0) {
//					flag =true;
//					break;
					continue l;
				}
			}
			if(!flag) {//flag = true
				System.out.println(i);
			}
			flag = false;
			}
		long end = System.currentTimeMillis();
		System.out.println("�ҵ����е��������ĵ�ʱ��Ϊ��ms��:"+(end - start));
//		17342--����break��1704--���ϸ���i:85

	}
}
