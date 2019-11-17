package 数组;

public class 数组初始化 {
  static int arr[] = new int[]{1,2,3,4};
  static int arr2[] = {1,2,3,4,5,6,7,8,9,10};
  static void getLength(){
    System.out.println(arr.length);
    System.out.println("ok");
  }

  public static void main(String[] args) {
    System.out.println(arr.length);
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
      System.out.println(arr2.length);
      for (int index = 0; index <args.length ; index++) {
        System.out.println(args[index]);
//        System.out.println(数组初始化.getLength());
        数组初始化.getLength();
      }
    }
  }

}
