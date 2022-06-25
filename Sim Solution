                  import java.util.Arrays;
import java.util.Scanner;
public class MyClass
{
public static void main(String[] args)
{
Sim[] cards = new Sim[5];
Scanner sc = new Scanner(System.in);
for(int i = 0;i<5;i++)
{
int simId = sc.nextInt();sc.nextLine();
String customerName = sc.nextLine();
double balance = sc.nextDouble();
double ratePerSecond = sc.nextDouble();sc.nextLine();
String circle = sc.nextLine();
cards[i] = new Sim(simId,customerName, balance,ratePerSecond, circle);
}
String circle1 = sc.nextLine();
String circle2 = sc.nextLine();

Sim[] result = transferCustomerCircle(cards, circle1, circle2);

for(Sim s: result)
System.out.println(s.getSimId()+" "+s.getCustomerName()+" "
+s.getCircle() + " " + s.getRatePerSecond());

}

public static Sim[] transferCustomerCircle(Sim[] cards, String circle1, String circle2)
{
//method logic
  Sim[] sim=new Sim[0];
  for(int i=0;i<5;i++)
  {
    if(cards[i].getCircle().equalsIgnoreCase(circle1))
    {
      sim=Arrays.copyOf(sim,sim.length+1);
      sim[sim.length-1]=cards[i];
      sim[sim.length-1].setCir(circle2);
    }
  }
  //Sim temp=new Sim();
  for(int i=0;i<sim.length-1;i++)
  {
    for(int j=i+1;j<sim.length;j++)
    {
      if(sim[i].getRatePerSecond()<sim[j].getRatePerSecond())
      {
        Sim temp=sim[i];
        sim[i]=sim[j];
        sim[j]=temp;
      }
    }
  }
  return sim;
}

}

class Sim
{
//code to build Sim class
  int simId;
  String customerName;
  double balance;
  double ratePerSecond;
  String circle;
  
  public Sim(int simId,String customerName,double balance,double ratePerSecond,String circle)
  {
    this.simId=simId;
    this.customerName=customerName;
    this.balance=balance;
    this.ratePerSecond=ratePerSecond;
    this.circle=circle;
  }
  
  public void setCir(String c)
  {
    this.circle=c;
  }

  public int getSimId()
  {
    return simId;
  }
  public String getCustomerName()
  {
    return customerName;
  }
  public String getCircle()
  {
    return circle;
  }
  public double getRatePerSecond()
  {
    return ratePerSecond;
  }
  public double getBal()
  {
    return balance;
  }
  
}
            
