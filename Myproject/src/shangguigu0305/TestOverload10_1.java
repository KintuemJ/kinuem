package shangguigu0305;

public class TestOverload10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestOverload10_1 t = new TestOverload10_1();
		t.mOL(12);
		t.mOL(2, 3);
		t.mOL("nihaoya!");
		
		System.out.println(t.max(1, 2));
		System.out.println(t.max(2.3,2.4 ));
		System.out.println(t.max(4, 9, 7));
	}
	
	
	public int max(int i ,int j) {
		return (i>j)? i:j ;
	}
	
	public double max(double i,double j) {
		return (i>j)? i:j ;
	}
	
	public double max(double i,double j,double k) {
		return (max(i,j)>k)? max(i,j) :k;
		}
	
	
	
	//一下三个方法构成重载
	public  void mOL(int i) {
		System.out.println(i*i);
	}
	public void mOL(int i,int j) {
		System.out.println(i*j);
	}
	public void mOL(String str) {
		System.out.println(str);
	}

}
