import java.util.*;
public class MyClass{
  public static void main(String[] arg)
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    char c,x=' ';
    //System.out.print('c'<'d');
    for(int i=0;i<s.length();i++){
      c=s.charAt(i);
      if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
        if(x==' ')
        x=c;
        if(c<x)
          x=c;
      }
    }
    System.out.print(x);
  }
}
