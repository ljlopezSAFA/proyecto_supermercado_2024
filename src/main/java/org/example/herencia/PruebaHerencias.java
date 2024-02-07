package org.example.herencia;

public class PruebaHerencias {

    public static void main(String[] args) {
        Vehiculo v = new Vehiculo();
        Coche c = new Coche();
        c.setNumPlaza(5);
        c.setNumPuertas(5);
        c.setTieneMaletero(true);
        c.setMarca("Toyota");
        System.out.println(c);
    }
}
