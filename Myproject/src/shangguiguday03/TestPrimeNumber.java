package shangguiguday03;
/*
 100�������е�����
 */
public class TestPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag =false;
		long start = System.currentTimeMillis();
		for(int i=2;i<100000;i++) {//ʵ��100���ڵ���Ȼ���ı���
			//����ж�i�Ƿ�Ϊһ������/����
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
		System.out.println("�ҵ����е��������ĵ�ʱ��Ϊ��ms��:"+(end - start));
//		17342--����break��1704--���ϸ���i:85

	}

}
