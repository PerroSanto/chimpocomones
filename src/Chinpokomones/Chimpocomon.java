package Chinpokomones;
import java.util.ArrayList;
import java.util.List;

import Ataques.Ataques;

public abstract class Chimpocomon {
    private String nombre;
    private int NivelDeVida;
    private List<Ataques> listaDeAtaques = new ArrayList<>();


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivelDeVida() {
        return NivelDeVida;
    }

    public void setNivelDeVida(int nivelDeVida) {
        NivelDeVida = nivelDeVida;
    }


    public List<Ataques> getListaDeAtaques() {
        return listaDeAtaques;
    }

    public void setListaDeAtaques(List<Ataques> listaDeAtaques) {
        this.listaDeAtaques = listaDeAtaques;
    }


    public void atacarEnemigo(Chimpocomon otro) {
        int cantidadAtaques = this.listaDeAtaques.size();
        int range = (cantidadAtaques - 1) - 0 + 1;
        int ataqueRandom = (int) (Math.random() * range) + 0;
        this.listaDeAtaques.get(ataqueRandom).realizarAtaque(otro);
        System.out.println(this.nombre + "  ==> Atacando a ==> " + otro.nombre + " ==> Nivel de vida del atacado==  " + otro.getNivelDeVida());
    }

    public void recibirDanio(int unvalor) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
            System.out.println("INTERUPTED DELAY");
        }
        if (!this.estaMuerto()) {
            this.NivelDeVida = this.NivelDeVida - unvalor;
            if (NivelDeVida <= 0) {
                this.estaMuerto();
                System.out.println("El oponente esta muerto!");
                victoria();
                return;
            }
        }

        this.NivelDeVida = this.NivelDeVida - unvalor;
    }

    public Chimpocomon() {

    }

    public boolean estaMuerto() {
        return NivelDeVida <= 0;
        
    }

    private void victoria() {
        System.out.println("Has ganado !!!");
        System.exit(0);
    }
    
    public void recibirVida(int unvalor){
        this.NivelDeVida = this.NivelDeVida + unvalor;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}