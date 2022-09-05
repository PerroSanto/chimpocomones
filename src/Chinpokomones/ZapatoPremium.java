package Chinpokomones;
import Ataques.PomadaWassington;

public class ZapatoPremium extends Zapato{
   
    public ZapatoPremium() {
        final PomadaWassington pomadaWassington = new PomadaWassington();
        this.getListaDeAtaques().add(pomadaWassington);
        this.setNombre("ZapatoPremium");
    }
    
}
