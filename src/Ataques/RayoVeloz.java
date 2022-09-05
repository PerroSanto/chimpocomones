package Ataques;
import Chinpokomones.Chimpocomon;

public class RayoVeloz implements Ataques{

    int danio = 3;

    @Override
    public void realizarAtaque(Chimpocomon otro) {
        otro.recibirDanio(danio);
    }
}

