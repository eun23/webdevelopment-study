package section03;

public class Practice0302 {
  public static void main(String[] args) {
    int num1 = 10;
    int num2 = 20;
    
    boolean isEqual = num1 == num2;
    boolean isNotEqual = num1 != num2;
    boolean isGreater = num1 > num2;
    boolean isLess = num1 < num2;
    boolean isGreaterOrEquar = num1 >= num2;
    boolean isLessOrEquar = num1 <= num2;

    System.out.println("num1과 num2는 같다\t: " + isEqual);
    System.out.println("num1과 num2는 다르다\t: " + isNotEqual);
    System.out.println("num1이 num2보다 크다\t: " + isGreater);
    System.out.println("num1이 num2보다 작다\t: " + isLess);
    System.out.println("num1은 num2 이상이다\t: " + isGreaterOrEquar);
    System.out.println("num1은 num2 이하이다\t: " + isLessOrEquar);
  }
}