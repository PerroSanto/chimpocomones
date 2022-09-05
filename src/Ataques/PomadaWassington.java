package Ataques;
import Chinpokomones.Chimpocomon;

public class PomadaWassington implements Ataques{

    int danio = 5;

    @Override
    public void realizarAtaque(Chimpocomon otro) {
        otro.recibirVida(danio);
    }
}

