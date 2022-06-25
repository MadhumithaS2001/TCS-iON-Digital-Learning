import java.util.*;
public class MyClass
{
 public static void main(String[] args)
 {
   Scanner sc=new Scanner(System.in);
  //code to read values 
   Player[] p=new Player[4];
   for(int i=0;i<p.length;i++){
     int pid=sc.nextInt();
  String pName=sc.next();
  int iccr=sc.nextInt();
  int nom=sc.nextInt();
  int trs=sc.nextInt();
     p[i]=new Player(pid,pName,iccr,nom,trs);
     
	sc.nextLine();
   }
   int val=sc.nextInt();
  //code to call required method
   double[] res=findAverageScoreOfPlayers(p,val);
  //code to calculate Grade and display the results
   for(int i=0;i<res.length;i++)
   {    
     if(res[i]>=80.0)
       System.out.println("Grade A Player");
     else if(res[i]>=50)
       System.out.println("Grade B Player");
     else
       System.out.println("Grade C Player");
   }
   
 }

 public static double[] findAverageScoreOfPlayers(Player[] player,int totalMatches)
 {
  //method logic
   double[] avg=new double[0];
   for(int i=0;i<player.length;i++)
   {
     if(player[i].getnom()>totalMatches){
       avg=Arrays.copyOf(avg,avg.length+1);
       avg[avg.length-1]=(double)player[i].gettrs()/player[i].getnom();
     }
   }
   return avg; 
 }
}

class Player
{
  //code to build player class
  int pid;
  String pName;
  int iccr;
  int nom;
  int trs;
  public Player(int pid,String pName,int iccr,int nom,int trs){
    this.pid=pid;
    this.pName=pName;
    this.iccr=iccr;
    this.nom=nom;
    this.trs=trs;
  }
  public int getnom()
  {
    return nom;
  }
  public int gettrs()
  {
    return trs;
  }
  
}
