import java.util.ArrayList;

public class String_getBytes_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		getBytes()�������
//		��Java��,String��getBytes()�����ǵõ�һ������ϵͳĬ�ϵı����ʽ���ֽ����顣���ʾ�ڲ�ͬ�Ĳ���ϵͳ��,���صĶ�����һ��!
//		1�� str.getBytes();  ��������в�дcharset������õ���Sytem.getProperty("file.encoding"),����ǰ�ļ��ı��뷽ʽ�� 
//		2��  str.getBytes("charset");//ָ��charset�������ײ�洢��Unicode�����Ϊcharset�����ʽ���ֽ����鷽ʽ 
//		3��String  str=new String(str.getBytes("utf-8"),"gbk")); //
//		���Ѿ������������ֽ�����ת��Ϊgbk�����ʽ���ַ��������ڴ��м�Ϊgbk��ʽ���ֽ�����תΪUnicodeȥ�������� 
		String a ="���";
		byte[] array =a.getBytes();
		for (byte x:array) {
			System.out.println("x="+x);
			}		

		}


}
