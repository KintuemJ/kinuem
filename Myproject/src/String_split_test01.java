
public class String_split_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		�ַ����ָ�
		String ip = "192.168.0.49";
		String[] array1 = ip.split("\\.");// �����ƴ���
		String[] array2 = ip.split("\\.", 2);// ��������

		for (String tmp1 : array1) {
			System.out.print("[" + tmp1 + "] ");
		}
		System.out.println();

		for (String tmp2 : array2) {
			System.out.println("[" + tmp2 + "]");
		}
	}
}
