
public class BeybladeFabrikası {
    
    public  Beyblade beyblade_uret(String Beybladeturu){
        if (Beybladeturu.equals("Dragon")) {
            return  new Dragon("Takao", 800, 300,"Mavi Ejderha","Kutsal Canavar ile konuşma..");
            
            
        }
        else if (Beybladeturu.equals("Dranza")) {
            return  new Dranza("Tai", 600, 400,"Kırmızı Anka Kuşu");
            
        }
         else if (Beybladeturu.equals("Drayga")) {
            return  new Drayga("Rei", 800, 250,"Beyaz Kaplan");
            
        }
         else if (Beybladeturu.equals("Draciel")) {
            return  new Draciel("Max", 400, 1000,"Kara Kaplumbağa");
        
            
        }
         else return null;
}
    
}
