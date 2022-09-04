import java.util.ArrayList;

public class Gallotronix extends Chimpocomon{

    public Gallotronix() {
        final String nombre = "Gallotronix";
        final int nivelDeVida = 25;
        final ArrayList<Ataques> listaDeAtaques = new ArrayList<Ataques>();
        final GarraMecanica garraMecanica = new GarraMecanica();
        final AtaqueVeloz ataqueVeloz = new AtaqueVeloz(garraMecanica);
        listaDeAtaques.add(ataqueVeloz);
        this.setNombre(nombre);
        this.setNivelDeVida(nivelDeVida);
        this.setListaDeAtaques(listaDeAtaques);
        System.out.println(this.getNivelDeVida());
    }

}
