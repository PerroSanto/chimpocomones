package Ataques;
import Chinpokomones.Chimpocomon;

public class GarraMecanica implements Ataques{

        int danio = 2;

        @Override
        public void realizarAtaque(Chimpocomon otro) {
            otro.recibirDanio(danio);
        }
    }

