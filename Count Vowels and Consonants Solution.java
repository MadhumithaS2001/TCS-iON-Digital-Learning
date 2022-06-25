                  import java.util.*;
public class MyClass{
  public static void main(String[] args){
    String word;
    Scanner sc=new Scanner(System.in);
    word=sc.nextLine();
    //System.out.print(word);
    int v=0,c=0;
    for(int i=0;i<word.length();i++){
      char w=word.charAt(i);
      if((w>='a' && w<='z') || (w >='A' && w<='Z')){
        if(w=='a' || w=='e' || w=='i' || w=='o' || w=='u' || w=='A' || w=='E' || w=='I' ||  
           w=='O' || w=='U'){ 
         v+=1;
      	}
      	else{
          c+=1;
      	}
      }
    }
    //if(v<c)
      System.out.print("Number of Vowels: "+v+"\nNumber of Consonants: "+c);
    //else
      //System.out.print("Number of Consonants: "+c+"\nNumber of Vowels: "+v);
  }
}
            
