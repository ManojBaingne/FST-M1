package activity;

public class Activity12 {

	public static void main(String[] args) {
		Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(15, 20));
 
        // Lambda expression with return keyword.
        Addable ad2 = (int a, int b) -> 
        {
            return (a + b);
        };
        System.out.println(ad2.add(150, 200));

	}

}
