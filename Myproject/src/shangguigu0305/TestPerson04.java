package shangguigu0305;


/**
 * 1���������ı�̹�ע��������
 * 2�������ʵ���Ͼ��������ĳ�Ա
 * 3����������ĳ�Ա�����ԣ���Ա������&����
 * @author Administrator
 *
 */

/*
 * �������˼�����ط���һ��
 * 1������࣬�������ĳ�Ա����Ա����&��Ա������
 * 2��ͨ���࣬��������Ķ���Ҳ�������ʵ������
 * 3��ͨ��������.���ԡ��򡰶���.�����������ã������Ӧ�Ĺ���
 */
public class TestPerson04 {
	public static void main(String[] args) {
		//�����������͵��������������� ������=��ʼ��ֵ
		int i = 10;
		//���ʵ���������µ�a1����һ��ʵʵ���ڵĶ���
		//ͨ�������������
		Person a1 = new Person();
		a1.name ="����";
		a1.age = 20;
		System.out.println(a1.name+a1.age);
		
		Person a2 = new Person();
		a2.name = "����";
		a2.age = 10;
		System.out.println(a2.name+a2.age);
		
		a2.setName("����");
		System.out.println(a2.name);
		
		a1.setName("èè");
		Person a3 =a2;
		System.out.println(a3.name+a1.name);
		
		System.out.println(a3.getName());
		a1.info();
		
		a1.eat();
	}



static class Person{
	//1�����ԣ�
	String name;
	int age;
	boolean sex;
	
	//2��������
	public void eat() {
		System.out.println("�˳Է�");
		
	}
	public void sleep() {
		System.out.println("��˯��");	
	}
	public String getName() {
		return name;	
	}
	public void setName(String n) {
		 name =n; 
	}
	public void info() {
		eat();
		sleep();
		System.out.println("����");
		
	}
}
}
