package Ataques;
public abstract class AtaquesDecorator implements Ataques{
    private Ataques ataque;
    public AtaquesDecorator(Ataques ataque){
        this.ataque = ataque;
    }
    protected Ataques getAtaquePower(){
        return ataque;
    }
}
