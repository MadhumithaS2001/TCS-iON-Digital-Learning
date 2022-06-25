import java.util.*;
public class MyClass{
  public static void main(String a[]){
    int num;
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    int res=0;
    while(num>0){
      res=res*10+(num%10);
      num=num/10;
    }
    System.out.println(""Reverse of the number is ""+res);
  }
}
