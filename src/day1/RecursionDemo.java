package day1;

public class RecursionDemo {
	static int fn(int n){
		if (n == 0){
			return 0;
		}
		else if (n == 1){
			return 1;
		}
		else {
			return fn(n-1)+fn(n-2);
		}
	}

	public static void main(String[] args) {
		System.out.println(fn(11));
		for (int i = 0; i < 10; i++) {
			System.out.println(fn(i));

		}
	}
}
