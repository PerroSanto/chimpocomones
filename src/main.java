import java.math.BigInteger;
import java.util.Random;

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


    while(!carnotron.estaMuerto() || !zapato.estaMuerto()) {
      System.out.println(carnotron.getNombre()+ ' '+ carnotron.getNivelDeVida()); 
      System.out.println(zapato.getNombre()+ ' '+ zapato.getNivelDeVida());
      if (!carnotron.estaMuerto()){
        carnotron.atacarEnemigo(zapato);
      } else{
      
      zapato.atacarEnemigo(carnotron);
       }
    }

    //quedo mal la lógica , le sigue pegando aunque este muerto uno de los 2, 
    // y con el decorator estan pegando de más
 /*    while(!carnotron.estaMuerto() || !gallotronix.estaMuerto()) {
            System.out.println(carnotron.getNombre()+ ' '+ carnotron.getNivelDeVida()); 
            System.out.println(gallotronix.getNombre()+ ' '+ gallotronix.getNivelDeVida());
            carnotron.atacarEnemigo(gallotronix);
            gallotronix.atacarEnemigo(carnotron);
            
          }*/

   /* while(!zapato.estaMuerto() || !zapatoPremium.estaMuerto()) {
        zapato.atacarEnemigo(zapatoPremium);
        zapatoPremium.atacarEnemigo(zapato);
       }
       System.out.println("Acabo la batalla uno... vayamos a la siguiente!!!!");
   */ 
 /*  while(!gallotronix.estaMuerto() || !zapatoPremium.estaMuerto()) {
    gallotronix.atacarEnemigo(zapatoPremium);
    System.out.println(zapatoPremium.getNombre()+ ' '+ zapatoPremium.getNivelDeVida());
    zapatoPremium.atacarEnemigo(gallotronix);
    System.out.println(gallotronix.getNombre()+ ' '+ gallotronix.getNivelDeVida());
   }
   System.out.println("Acabo la batalla uno... vayamos a la siguiente!!!!");
*/

}
}
