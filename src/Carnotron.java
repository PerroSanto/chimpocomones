import java.util.ArrayList;
import java.util.List;

public class Carnotron extends Chimpocomon {


    public Carnotron() {
        final String nombre = "Carnotron";
        final int nivelDeVida = 20;
        final ArrayList<Ataques>  listaDeAtaques = new ArrayList<Ataques>();
        final RayoVeloz rayoVeloz = new RayoVeloz();
        final CanionConico canionConico = new CanionConico();
        listaDeAtaques.add(rayoVeloz);
        listaDeAtaques.add(canionConico);
        this.setNombre(nombre);
        this.setNivelDeVida(nivelDeVida);
        this.setListaDeAtaques(listaDeAtaques);
    }
}
