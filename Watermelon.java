import java.util.Scanner;
public class Watermelon{
   public static void main(String args[]){
       Scanner scan = new Scanner(System.in);
       System.out.print("�������� �Է��ϼ���: ");
       int r = scan.nextInt();  
       final double PI = 3.14;

       double area = r*r*PI;
       System.out.println("������ ���̴�: " + area);
       
  }
}