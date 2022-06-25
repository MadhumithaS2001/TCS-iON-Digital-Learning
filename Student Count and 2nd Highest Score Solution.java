                  import java.util.Arrays;
import java.util.Scanner;
public class MyClass
{

 public static void main(String[] args)
 {
  //code to read values 
   Scanner sc=new Scanner(System.in);
   
   int rollNo;
   String name;
   String branch;
   double score;
   boolean dayScholar;
   
   Student[] st=new Student[4];
   
   for(int i=0;i<4;i++)
   {
     rollNo=sc.nextInt();
     sc.nextLine();
     name=sc.nextLine();
     branch=sc.nextLine();
     //sc.nextLine();
     score=sc.nextDouble();
     dayScholar=sc.nextBoolean();
     
     st[i]=new Student(rollNo,name,branch,score,dayScholar);
     //System.out.println(st[i].getRollNo()+" "+st[i].getName()+st[i].getBranch()+" "+st[i].getScore());
   }
   
  //code to call required method
   int count=findCountOfDayscholarStudents(st);
   Student shs=findStudentwithSecondHighestScore(st);
  //code to display the result
   if(count>0)
   System.out.println(count);
   else
     System.out.println("There are no such dayscholar students");
   if(shs!=null)
   System.out.print(shs.getRollNo()+"#"+shs.getName()+"#"+shs.getScore());
   else
     System.out.print("There are no student from non day scholar");
 }
    
 //code the first method
 public static int findCountOfDayscholarStudents(Student[] s)
 {
   int count=0;
   for(Student i:s)
   {
     if(i.getDayScholar())
       count+=1;
   }
   return count;
 }
 //code the second method   
 public static Student findStudentwithSecondHighestScore(Student[] s)
 {
   Student[] res=new Student[0];
   for(Student i:s)
   {
     if(!(i.getDayScholar()))
     {
       res=Arrays.copyOf(res,res.length+1);
       res[res.length-1]=i;
     }
   }
   
   for(int i=0;i<res.length-1;i++)
   {
     for(int j=i;j<res.length;j++)
     {
       if(res[i].getScore()<res[j].getScore())
       {
         Student temp=res[i];
         res[i]=res[j];
         res[j]=temp;
       }
     }
   }
   if(res.length>1)
   {
     return res[1];
   }
   else if(res.length==1)
   {
     return res[0];  
   }
   else
     return null;
 }

}

//code the class
class Student
{
  int rollNo;
  String name;
  String branch;
  double score;
  boolean dayScholar;
  
  public Student(int rollNo,String name,String branch,double score,boolean dayScholar)
  {
    this.rollNo=rollNo;
    this.name=name;
    this.branch=branch;
    this.score=score;
    this.dayScholar=dayScholar;
  }
  
  public int getRollNo()
  { return rollNo;
  }
  public String getName()
  { return name;
  }
  public String getBranch()
  { return branch;
  }
  public double getScore()
  { return score;
  }
  public boolean getDayScholar()
  { return dayScholar;
  }
  
}
                              import java.util.Arrays;
import java.util.Scanner;
public class MyClass
{

 public static void main(String[] args)
 {
  //code to read values 
   Scanner sc=new Scanner(System.in);
   
   int rollNo;
   String name;
   String branch;
   double score;
   boolean dayScholar;
   
   Student[] st=new Student[4];
   
   for(int i=0;i<4;i++)
   {
     rollNo=sc.nextInt();
     sc.nextLine();
     name=sc.nextLine();
     branch=sc.nextLine();
     //sc.nextLine();
     score=sc.nextDouble();
     dayScholar=sc.nextBoolean();
     
     st[i]=new Student(rollNo,name,branch,score,dayScholar);
     //System.out.println(st[i].getRollNo()+" "+st[i].getName()+st[i].getBranch()+" "+st[i].getScore());
   }
   
  //code to call required method
   int count=findCountOfDayscholarStudents(st);
   Student shs=findStudentwithSecondHighestScore(st);
  //code to display the result
   if(count>0)
   System.out.println(count);
   else
     System.out.println("There are no such dayscholar students");
   if(shs!=null)
   System.out.print(shs.getRollNo()+"#"+shs.getName()+"#"+shs.getScore());
   else
     System.out.print("There are no student from non day scholar");
 }
    
 //code the first method
 public static int findCountOfDayscholarStudents(Student[] s)
 {
   int count=0;
   for(Student i:s)
   {
     if(i.getDayScholar())
       count+=1;
   }
   return count;
 }
 //code the second method   
 public static Student findStudentwithSecondHighestScore(Student[] s)
 {
   Student[] res=new Student[0];
   for(Student i:s)
   {
     if(!(i.getDayScholar()))
     {
       res=Arrays.copyOf(res,res.length+1);
       res[res.length-1]=i;
     }
   }
   
   for(int i=0;i<res.length-1;i++)
   {
     for(int j=i;j<res.length;j++)
     {
       if(res[i].getScore()<res[j].getScore())
       {
         Student temp=res[i];
         res[i]=res[j];
         res[j]=temp;
       }
     }
   }
   if(res.length>1)
   {
     return res[1];
   }
   else if(res.length==1)
   {
     return res[0];  
   }
   else
     return null;
 }

}

//code the class
class Student
{
  int rollNo;
  String name;
  String branch;
  double score;
  boolean dayScholar;
  
  public Student(int rollNo,String name,String branch,double score,boolean dayScholar)
  {
    this.rollNo=rollNo;
    this.name=name;
    this.branch=branch;
    this.score=score;
    this.dayScholar=dayScholar;
  }
  
  public int getRollNo()
  { return rollNo;
  }
  public String getName()
  { return name;
  }
  public String getBranch()
  { return branch;
  }
  public double getScore()
  { return score;
  }
  public boolean getDayScholar()
  { return dayScholar;
  }
  
}
            
