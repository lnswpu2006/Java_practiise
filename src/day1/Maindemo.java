package day1;

public class Maindemo {
	//共同的200行代码抽离出来
	static void doWork(){
		System.out.println("共同的200行代码");
	}
	public static void main(String[] args) {
		System.out.println("代码片段A!!");
		Maindemo.doWork();
		System.out.println("代码片段B!!");
		Maindemo.doWork();
	}
}
