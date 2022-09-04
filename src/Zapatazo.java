public class Zapatazo implements Ataques {

    int danio = 1;

    @Override
    public void realizarAtaque(Chimpocomon otro) {
        otro.recibirDanio(danio);
    }

}
