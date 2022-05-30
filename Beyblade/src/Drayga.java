/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehmet
 */
public class Drayga extends Beyblade{
        private String Kutsal_Canavar;

    public Drayga(String Beybladci, int Donus_hızı, int Saldırı_gucu,String Kutsal_Canavar) {
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
        System.out.println(getBeybladci()+" ın saldırısı :KAPLAN PENÇESİ");
    }
    
    
    
    
}
