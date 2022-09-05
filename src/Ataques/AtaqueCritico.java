package Ataques;
import Chinpokomones.Chimpocomon;

public class AtaqueCritico extends AtaquesDecorator{

    public AtaqueCritico(Ataques ataque) {
        super(ataque);
    }

    @Override
    public void realizarAtaque(Chimpocomon otro) {
        System.out.println("Ataque critico");
        getAtaquePower().realizarAtaque(otro);
    }
}