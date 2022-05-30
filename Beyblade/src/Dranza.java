
public class Dranza extends Beyblade{
    
    private String Kutsal_Canavar;

    public Dranza(String Beybladci, int Donus_hızı, int Saldırı_gucu,String Kutsal_Canavar) {
        super(Beybladci, Donus_hızı, Saldırı_gucu);
        this.Kutsal_Canavar = Kutsal_Canavar;
    }

    @Override
    public void BiilgileriGoster() {
        super.BiilgileriGoster();//To change body of generated methods, choose Tools | Templates.
        System.out.println("Kutsal Canavar adı : "+Kutsal_Canavar);
    }

    @Override
    public void KutsalCanavarOrtayaCıkıyor() {
        super.KutsalCanavarOrtayaCıkıyor();//To change body of generated methods, choose Tools | Templates.
        System.out.println(getBeybladci()+" "+Kutsal_Canavar+" ı ortaya çıkaraıyor.");
        System.out.println(getBeybladci()+" ın saldırısı :ALEV KILICI");
    }
    
    
    
}
