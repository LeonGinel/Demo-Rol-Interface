package Rol;

import java.util.ArrayList;

public class Listas {
    private ArrayList<Raza> razas;
    private ArrayList<Personaje> pjs;
    private ArrayList<Personaje> pnjs;

    public Listas() {
        razas = new ArrayList<>();
        pjs = new ArrayList<>();
        pnjs = new ArrayList<>();
    }

    // Métodos para acceder y modificar las listas de razas, pjs y pnjs
    public ArrayList<Raza> getRazas() {
        return razas;
    }

    public void setRazas(ArrayList<Raza> razas) {
        this.razas = razas;
    }

    public ArrayList<Personaje> getPjs() {
        return pjs;
    }

    public void setPjs(ArrayList<Personaje> pjs) {
        this.pjs = pjs;
    }

    public ArrayList<Personaje> getPnjs() {
        return pnjs;
    }

    public void setPnjs(ArrayList<Personaje> pnjs) {
        this.pnjs = pnjs;
    }
    
    Listas listaRazas = new Listas();
}