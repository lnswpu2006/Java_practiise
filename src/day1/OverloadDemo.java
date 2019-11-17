package day1;

import org.jetbrains.annotations.Contract;

public class OverloadDemo {
	//两同一不同：同一个类，方法名相同，参数列表不同
	//求两个整数之和
	@Contract(pure = true)
	static int getSum(int x, int y){
		return x + y;
	}
	//求两个小数之和
	@Contract(pure = true)
	static  double getSum(double x, double y){
		return x + y;
	}

	public static void main(String[] args) {
		int sum = OverloadDemo.getSum(3,5);
		double sum2 = OverloadDemo.getSum(3.0,5);
		System.out.println(sum);
		System.out.println(sum2);
	}
}
