package Chinpokomones;
import Ataques.CanionConico;
import Ataques.RayoVeloz;

public class Carnotron extends Chimpocomon {


    public Carnotron() {
        final RayoVeloz rayoVeloz = new RayoVeloz();
        final CanionConico canionConico = new CanionConico();
        this.getListaDeAtaques().add(rayoVeloz);
        this.getListaDeAtaques().add(canionConico);
        this.setNombre("Carnotron");
        this.setNivelDeVida(20);
    }
}
