import java.util.ArrayList;

public class Zapato extends Chimpocomon{

    public Zapato() {
        final String nombre = "Zapato";
        final int nivelDeVida = 30;
        final ArrayList<Ataques> listaDeAtaques = new ArrayList<Ataques>();
        final GarraMecanica garraMecanica = new GarraMecanica();
        final Zapatazo zapatazo = new Zapatazo();
        listaDeAtaques.add(zapatazo);
        this.setNombre(nombre);
        this.setNivelDeVida(nivelDeVida);
        this.setListaDeAtaques(listaDeAtaques);
    }

}
