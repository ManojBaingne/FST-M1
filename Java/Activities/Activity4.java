package activity;

import java.util.Arrays;

public class Activity4 {

	static void sortNum(int num[]) {
		int size = num.length;

		for (int i=1; i < size; i++) {
			int temp = num[i];
			int j = i - 1;

			while (j >= 0 && temp < num[j]) {
				num[j + 1] = num[j];
				--j;
			}
			num[j + 1] = temp;
		}

	}

	public static void main(String[] args) {
		
		int[] numberRandom = {15,7,9,17,5,19,11,3,2};
		sortNum(numberRandom);
		System.out.println(Arrays.toString(numberRandom));

	}

}
