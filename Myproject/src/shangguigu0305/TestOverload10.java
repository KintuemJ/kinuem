package shangguigu0305;


/*
 * ���������أ�overload��
 * Ҫ��1��ͬһ���� 2��������������ͬ 3�������Ĳ����б�ͬ���ٲ����ĸ�����ͬ �ڲ������Ͳ�ͬ��
 * ���䣺�����������뷽���ķ���ֵû�й�ϵ
 */
public class TestOverload10 {

	
	
class Overload{
	//��������int���ͱ����ĺ�
	public int getSum(int i,int j) {
		return i+j;
	}
	
	//���������int���ͱ����ĺ�
	public int  getSum(int i,int j,int k) {
		return i+j+k;
		
	}
	
	//��������double���ͱ����ĺ�
	public double getSum(double i,double j) {
		return i + j;
	}
	
	
}
}
