package shangguigu0305;

public class TestArray10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 100, -50, 0, 23, 99, -1, 55, 21, 0 };

		TestArrayUtils10 au = new TestArrayUtils10();
		int max = au.getMax(arr);
		System.out.println("最大值为：" + max);

		int min = au.getMin(arr);
		System.out.println("最小值为：" + min);

		System.out.println("遍历数组元素：");
		au.printArray(arr);
		System.out.println("");

		int sum = au.getSum(arr);
		System.out.println("数组的总和为：" + sum);

		int avg = au.avg(arr);
		System.out.println("数组的平均值为：" + avg);

		au.reverse(arr);
		System.out.println("数组的反转为：");
		au.printArray(arr);

		System.out.println("");
		au.sortArray(arr, "asc");
		System.out.println("数组从小到大的排序为：");
		au.printArray(arr);

		System.out.println("");
		au.sortArray(arr, "desc");
		System.out.println("数组从大到小的排序为：");
		au.printArray(arr);

	}

}
