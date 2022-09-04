public class CanionConico implements Ataques{

        int danio = 4;

        @Override
        public void realizarAtaque(Chimpocomon otro) {
            otro.recibirDanio(danio);
        }
    }

