public class main {
    public static void main(String[] args){


    Carnotron carnotron = new Carnotron();
    Gallotronix gallotronix = new Gallotronix();


   while(!carnotron.estaMuerto() || !gallotronix.estaMuerto()) {
        carnotron.atacarEnemigo(gallotronix);
        gallotronix.atacarEnemigo(carnotron);
       }

    }



}
