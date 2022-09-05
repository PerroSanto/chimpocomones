package Chinpokomones;
import Ataques.GarraMecanica;
import Ataques.Zapatazo;

public class Zapato extends Chimpocomon{

    public Zapato() {
        final GarraMecanica garraMecanica = new GarraMecanica();
        final Zapatazo zapatazo = new Zapatazo();
        this.getListaDeAtaques().add(zapatazo);
        this.setNombre("Zapato");
        this.setNivelDeVida(30);
       
    }

}
