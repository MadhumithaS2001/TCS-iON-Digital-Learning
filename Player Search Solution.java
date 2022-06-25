                  import java.util.*;
public class MyClass
{

public static void main(String[] args)
{
//code to read values
  Scanner sc=new Scanner(System.in);
  Player[] player=new Player[4];
  int id;String coun; String side; double price;
  for(int i=0;i<4;i++)
  {
    id=sc.nextInt();sc.nextLine();
    coun=sc.nextLine();
    side=sc.nextLine();
    price=sc.nextDouble();
    player[i]=new Player(id,coun,side,price);
    
  }
//code to call required method
  String search=sc.next();
  Player[] res=searchPlayerForMatch(search,player);
//code to display the result
  int r[]=new int[res.length];
  for(int i=0;i<res.length;i++){
    r[i]=res[i].getid();
  }
  Arrays.sort(r);
  for(int i=0;i<res.length;i++){
    System.out.println(r[i]);
  }

}

public static Player[] searchPlayerForMatch(String search, Player[] players)
{
//method logic
Player[] p=new Player[0];
for(int i=0;i<4;i++){
    if(players[i].getbb().equals(search)){
    p=Arrays.copyOf(p,p.length+1);
    p[p.length-1]=players[i];
    }
}
return p;

}
}

class Player
{
//code to build Player class
int id;
String coun;
String bb;
double price;
public Player(int a,String b,String c,double d){
    this.id=a;
    this.coun=b;
    this.bb=c;
    this.price=d;
}
public String getbb(){
    return bb;
}
  public int getid(){
    return id;
  }
}
            
