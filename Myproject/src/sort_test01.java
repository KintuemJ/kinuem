public class sort_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sort_test01 s = new sort_test01();
		int[] arr = new int[] { 22, 112, 0, -5, 34, 0, 55, -6 };
		s.sort(arr, "asc");
		s.printArr(arr);

	}

	public void sort(int[] arr, String art) {
		if (art == "asc") {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length - 1; j++) {
					if (arr[j] > arr[j + 1]) {// ��С��������
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;

					}
				}

			}
		}

		else if (art == "desc") {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length - 1 - i; j++) {
					if (arr[j] < arr[j + 1]) {// �Ӵ�С����
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;

					}
				}
			}

		} else {
			System.out.println("��������д������������룺'asc' or 'desc'");
		}
	}

	public void printArr(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("]");

	}
}
