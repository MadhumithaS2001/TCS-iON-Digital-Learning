import java.util.*;
public class MyClass
{
  public static void main(String [] args){
    String word;
    Scanner sc=new Scanner(System.in);
    word=sc.next();
    word=word.toLowerCase();
    char w;
    for(int i=0;i<word.length();i++){
      w=word.charAt(i);
      if(w!='a' && w!='e' && w!='i' && w!='o' && w!='u'){ 
      	System.out.print(word.charAt(i));
      }
  	}
  }
}
