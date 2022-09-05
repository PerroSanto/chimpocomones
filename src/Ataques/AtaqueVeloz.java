package Ataques;
import Chinpokomones.Chimpocomon;

public class AtaqueVeloz extends AtaquesDecorator{

    public AtaqueVeloz(Ataques ataque) {
        super(ataque);
    }

    @Override
    public void realizarAtaque(Chimpocomon otro) {
        int fiftyFyfty = (int) (Math.random() * 2) + 0;

        if (fiftyFyfty == 0){
            getAtaquePower().realizarAtaque(otro);
            System.out.println("entra en ataque veloz");
        } else
            System.out.println("Tuvo suerte y atacó dos veces");
            getAtaquePower().realizarAtaque(otro);
            getAtaquePower().realizarAtaque(otro);
    }
}
