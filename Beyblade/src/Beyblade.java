/*


Polymorpism kullanarak beyblade programı yapacağız..
*/
public class Beyblade {
    private String Beybladci;
    private int Donus_hızı;
    private  int Saldırı_gucu;

    public Beyblade(String Beybladci, int Donus_hızı, int Saldırı_gucu) {
        this.Beybladci = Beybladci;
        this.Donus_hızı = Donus_hızı;
        this.Saldırı_gucu = Saldırı_gucu;
    }
    
    public void saldırı(){
        System.out.println(getBeybladci()+", "+Saldırı_gucu+" Saldırı gücü ve  "+Donus_hızı+" Dönüş hızı  ile saldırıyor");
  }
    
    public void KutsalCanavarOrtayaCıkıyor(){
        System.out.println("Bu Beyblade in kutsal canacarı yokk.");
 
        
    }
    public  void BiilgileriGoster(){
        System.err.println("Beyblade bilgileri");
        System.out.println("Beybladeci ismi : "+Beybladci);
        System.out.println("Dönüş Hızı :  "+Donus_hızı);
        System.out.println("Saldırı gücü : "+Saldırı_gucu);
        System.out.println("******");}
    
    /**
     * @return the Beybladci
     */
    public String getBeybladci() {
        return Beybladci;
    }

    /**
     * @param Beybladci the Beybladci to set
     */
    public void setBeybladci(String Beybladci) {
        this.Beybladci = Beybladci;
    }

    /**
     * @return the Donus_hızı
     */
    public int getDonus_hızı() {
        return Donus_hızı;
    }

    /**
     * @param Donus_hızı the Donus_hızı to set
     */
    public void setDonus_hızı(int Donus_hızı) {
        this.Donus_hızı = Donus_hızı;
    }

    /**
     * @return the Saldırı_gucu
     */
    public int getSaldırı_gucu() {
        return Saldırı_gucu;
    }

    /**
     * @param Saldırı_gucu the Saldırı_gucu to set
     */
    public void setSaldırı_gucu(int Saldırı_gucu) {
        this.Saldırı_gucu = Saldırı_gucu;
    }
    
    
    
}
