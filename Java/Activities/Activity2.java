package practice;

public class Activity2 {

	public static void main(String[] args) {
		int a[] = new int[6];
		a[0] = 10;
		a[1] = 77;
		a[2] = 10;
		a[3] = 54;
		a[4] = -11;
		a[5] = 10;

		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 10) {
				sum = sum + a[i];
			}

		}
		if (sum == 30) {
			System.out.println("Sum is " + sum);
		} else {
			System.out.println("Sus is not " + 30);
		}

	}

}
