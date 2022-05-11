import java.util.Scanner;
public class Watermelon{
   public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       System.out.print("반지름을 입력하세요: ");
       int r = scan.nextInt();  
       final double PI = 3.14;

       double area = r*r*PI;
       System.out.println("수박의 넓이는: " + area);
       
  }
}