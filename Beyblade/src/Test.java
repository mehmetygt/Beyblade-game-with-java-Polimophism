
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        System.out.println("Beyblade oyununua hoş geldiniz..");
        System.out.println("------");

         
         Scanner scanner=new  Scanner(System.in);
         
         while (true) {  
             System.out.println("Hangi Beybladi üretmek istiyorsunuz??");
             System.out.println("Dragon--Takao \n"+"Dranza--Tai\n"+"Drayga--Rei\n"+"Draciel--Max");
             System.out.println("Çıkış için q ya basın....");
             System.out.println("------");
             String islem=scanner.nextLine();
             if (islem.equals("q")) {
                 System.out.println("Programdan çıkılıyor.");
                 break; 
             }
             else  {
                 BeybladeFabrikası fabrikası=new BeybladeFabrikası();
                 Beyblade beyblade=fabrikası.beyblade_uret(islem);
                 if (beyblade==null) {
                     System.out.println(" lütfen geçerli bir isim girin");
                     System.out.println("********");
                     
                 }
                 else{
                 beyblade.BiilgileriGoster();
                 System.out.println("********");
                 
                 beyblade.saldırı();
                 System.out.println("********");
                 
                 beyblade.KutsalCanavarOrtayaCıkıyor();
                  System.out.println("********");
                 
                 }
                 
             }
            
        }
    }
}
