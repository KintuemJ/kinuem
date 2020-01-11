package shangguigu0305;


public class TestPerson09 {
	public static void main(String[] args) {
		Person p = new Person();
		p.study();
		p.showAge();
		p.addAge(2);
		p.showAge();
		
		Person p1 = new Person();
		p.showAge();//2
		p.addAge(2);
		p.showAge();

	}

static class Person{
	String name;
	int age;
	int sex;
	
	public void study() {
		System.out.println("studying");
		
	}
	
	public void showAge() {
		System.out.println(age);
	}

	public int addAge(int i) {
		age += i;
		return age;
		
	}
	
	}

}
