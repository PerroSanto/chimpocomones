package Chinpokomones;

import Ataques.AtaqueVeloz;
import Ataques.GarraMecanica;

public class Gallotronix extends Chimpocomon{

    public Gallotronix() {
        final GarraMecanica garraMecanica = new GarraMecanica();
        final AtaqueVeloz ataqueVeloz = new AtaqueVeloz(garraMecanica);
        this.getListaDeAtaques().add(ataqueVeloz);
        //this.getListaDeAtaques().add(garraMecanica);
        this.setNombre("Gallotronix");
        this.setNivelDeVida(25);
        System.out.println(this.getNivelDeVida());
    }

}
