/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9p2_alberthgodoy_diegochavez;

import java.util.ArrayList;


public class juegos {
   // saber la categoría,
//el costo del juego, su respectivo nombre y los idiomas en los que está el juego.
    private int id;
    private String categoria;
    private double costo;
    private String nombre;
    private ArrayList<idiomas> listaidiomas = new ArrayList();

    public juegos(String categoria, double costo, String nombre,int id) {
        this.categoria = categoria;
        this.costo = costo;
        this.nombre = nombre;
        this.id = id;
    }
    
    

    public String getCategoria() {
        return categoria;
    }

    public double getCosto() {
        return costo;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<idiomas> getListaidiomas() {
        return listaidiomas;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setListaidiomas(ArrayList<idiomas> listaidiomas) {
        this.listaidiomas = listaidiomas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

        
    @Override
    public String toString() {
        return "juegos{" + "categoria=" + categoria + ", costo=" + costo + ", nombre=" + nombre + ", listaidiomas=" + listaidiomas + '}';
    }
    
    
    
}
