import Chinpokomones.Carnotron;
import Chinpokomones.Gallotronix;
import Chinpokomones.Zapato;
import Chinpokomones.ZapatoPremium;

public class main {
    public static void main(String[] args){


    Carnotron carnotron = new Carnotron();
    Gallotronix gallotronix = new Gallotronix();
    Zapato zapato = new Zapato();
    ZapatoPremium zapatoPremium = new ZapatoPremium();


    while(!zapato.estaMuerto() || !zapatoPremium.estaMuerto()) {
        zapato.atacarEnemigo(zapatoPremium);
        zapatoPremium.atacarEnemigo(zapato);
       }
       System.out.println("Acabo la batalla uno... vayamos a la siguiente!!!!");


    }

   /*while(!carnotron.estaMuerto() || !gallotronix.estaMuerto()) {
        carnotron.atacarEnemigo(gallotronix);
        gallotronix.atacarEnemigo(carnotron);
       }*/

  
   

    


}
