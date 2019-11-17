package day1;
//方法的定义与返回

public class MethodDemo {
	//无参数无返回
	static  void  p(){
		System.out.println("---------------");
	}
	//有参数 无返回
	//打印任意值
	static  void pValue(String value){
		System.out.println(value);
	}
	//返回年龄
	static  int getAge(){
		return 17;
	}

	public static void main(String[] args) {
		MethodDemo.p();
		MethodDemo.pValue("hello");
		MethodDemo.p();
		int age = MethodDemo.getAge();
		System.out.println(age);
	}
}

