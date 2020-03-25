package com.example.app_registry;




//clase entidad. Representa la tabla de la BD a realizar.
public class Seguimineto {

    int id;
    float medicion;
    int fecha;

    //hora puede varia tipo de dato
    int hora;



    //CONTRUCTOR
    public Seguimineto() {

    }



    //CONSTRUCTOR CON CADA VARIABLE
    public Seguimineto(int id, float medicion, int fecha, int hora) {
        this.id = id;
        this.medicion = medicion;
        this.fecha = fecha;
        this.hora = hora;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getMedicion() {
        return medicion;
    }

    public void setMedicion(float medicion) {
        this.medicion = medicion;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
}
