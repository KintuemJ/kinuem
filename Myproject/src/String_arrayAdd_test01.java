import java.util.Arrays;

public class String_arrayAdd_test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		´úÂëÈçÏÂ
		int[] arr = new int[] {1,2,3,4,5};
		System.out.println(Arrays.toString(addElementToArray(arr,7)));

		}
		public static int[] addElementToArray(int[] arr, int num) {
		int [] result = new int[arr.length+1];
		for(int i=0;i<arr.length;i++) {
		result[i]=arr[i];
		}
		result[result.length-1] = num;
		return result;
		}
	}  

