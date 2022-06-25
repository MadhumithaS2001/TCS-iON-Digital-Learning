import java.util.Arrays;
import java.util.Scanner;
public class MyClass
{

public static void main(String[] args)
{
//code to read values
  Scanner sc=new Scanner(System.in);
  Inventory inv[]=new Inventory[4];

  for(int i=0;i<4;i++)
  {
    inv[i]=new Inventory(sc.nextLine(),sc.nextInt(),sc.nextInt(),sc.nextInt());
    sc.nextLine();
    //System.out.println(i.getinv()+i.getmax()+i.getcurr()+i.getthres());
  }
  int limit=sc.nextInt();
//code to call required method
  Inventory[] res=replenish(limit,inv);
  
//code to display the results
  for(Inventory r:res)
  {
    System.out.print(r.getinv()+" ");
    int t=r.getthres();
    if(t>74)
      System.out.println("Critical Filling");
    else if(t>49)
      System.out.println("Moderate Filling");
    else
      System.out.println("Non-Critical Filling");
  }
  
}

public static Inventory[] replenish(int limit, Inventory[] inventory)
{
//method logic
  Inventory inv[]=new Inventory[0];
  for(Inventory i:inventory){
    if(i.getthres()<=limit)
    {
      inv=Arrays.copyOf(inv,inv.length+1);
      inv[inv.length-1]=i;
    }
  
  }
  return inv;

}

}

class Inventory
{
//code to build Inventory class
  String inventoryId;
  int maximumQuantity;
  int currentQuantity;
  int threshold;
  
  public Inventory(String inv, int max,int curr,int thres)
  {
    this.inventoryId=inv;
    this.maximumQuantity=max;
    this.currentQuantity=curr;
    this.threshold=thres;
  }
  
  public String getinv()
  {
    return inventoryId;
  }
  public int getmax()
  {
    return maximumQuantity;
  }
  public int getcurr()
  {
    return currentQuantity;
  }
  public int getthres()
  {
    return threshold;
  }
  
  
}
            
