
public class Dragon extends Beyblade{
    private String Kutsal_Canavar;
    private String GizliYetenek;
    
    public Dragon(String Beybladci, int Donus_hızı, int Saldırı_gucu,String Kutsal_Canavar,String GizliYetenek) {
        super(Beybladci, Donus_hızı, Saldırı_gucu);
        this.Kutsal_Canavar = Kutsal_Canavar;
        this.GizliYetenek=GizliYetenek;
    }

    @Override
    public void BiilgileriGoster() {
        super.BiilgileriGoster();//To change body of generated methods, choose Tools | Templates.
        System.out.println("Kutsal Canavar adı : "+Kutsal_Canavar);
        System.out.println("Gizli yetenek : "+GizliYetenek);
    }

    @Override
    public void KutsalCanavarOrtayaCıkıyor() {
        super.KutsalCanavarOrtayaCıkıyor();//To change body of generated methods, choose Tools | Templates.
        System.out.println(getBeybladci()+" "+Kutsal_Canavar+" ı ortaya çıkaraıyor.");
        System.out.println(getBeybladci()+" ın saldırısı :HAYALET KASIRGASI");
    }
    
}
