package shangguigu0305;


/**
 * 1、面向对象的编程关注于类的设计
 * 2、设计类实际上就是设计类的成员
 * 3、基本的类的成员，属性（成员变量）&方法
 * @author Administrator
 *
 */

/*
 * 面向对象思想的落地法则一：
 * 1、设计类，并设计类的成员（成员变量&成员方法）
 * 2、通过类，来创建类的对象（也称作类的实例化）
 * 3、通过“对象.属性”或“对象.方法”来调用，完成相应的功能
 */
public class TestPerson04 {
	public static void main(String[] args) {
		//基本数据类型的声明，数据类型 变量名=初始化值
		int i = 10;
		//类的实例化：如下的a1就是一个实实在在的对象
		//通过对象调用属性
		Person a1 = new Person();
		a1.name ="花花";
		a1.age = 20;
		System.out.println(a1.name+a1.age);
		
		Person a2 = new Person();
		a2.name = "哈哈";
		a2.age = 10;
		System.out.println(a2.name+a2.age);
		
		a2.setName("狗狗");
		System.out.println(a2.name);
		
		a1.setName("猫猫");
		Person a3 =a2;
		System.out.println(a3.name+a1.name);
		
		System.out.println(a3.getName());
		a1.info();
		
		a1.eat();
	}



static class Person{
	//1、属性：
	String name;
	int age;
	boolean sex;
	
	//2、方法：
	public void eat() {
		System.out.println("人吃饭");
		
	}
	public void sleep() {
		System.out.println("人睡觉");	
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
		System.out.println("呼吸");
		
	}
}
}
