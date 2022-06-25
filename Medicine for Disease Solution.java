import java.util.Arrays;
import java.util.Scanner;
public class MyClass{
 public static void main(String[] args) {
  Medicine[] medicine = new Medicine[4];
  String search;
  Scanner sc = new Scanner(System.in);
  for (int i = 0; i < medicine.length; i++) {
   String medicineName = sc.nextLine();
   String batchNo = sc.nextLine();
   String disease = sc.nextLine();
   int price = sc.nextInt();
   sc.nextLine();
   medicine[i] = new Medicine(medicineName, batchNo, disease, price);
  }
  search = sc.nextLine();
  Integer[] price = medicinePriceForGivenDisease(medicine, search);
  for(int i=0;i<price.length;i++) {
   System.out.println(price[i]);
  }
 }
 public static Integer[] medicinePriceForGivenDisease(Medicine[] medicine,String disease)
 {
   Integer[] pr=new Integer[0];
   for(int i=0;i<medicine.length;i++){
     if(medicine[i].getMedName().equalsIgnoreCase(disease)){
       pr=Arrays.copyOf(pr,pr.length+1);
       pr[pr.length-1]=medicine[i].getPrice();
     }
     Arrays.sort(pr);
   }
   return pr;
 }
}
class Medicine
{
  String medicineName;
  String batchNo;
  String disease;
  int price;
  public String getMedName(){
    return disease;
  }
  public int getPrice(){
    return price;
  }
  public Medicine(String medicineName, String batchNo, String disease, int price)
  {
    this.medicineName=medicineName;
    this.batchNo=batchNo;
    this.disease=disease;
    this.price=price;
  }
}
