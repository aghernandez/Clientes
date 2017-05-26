package com.example.ghernandez.users;

import android.widget.EditText;

/**
 * Created by ghernandez on 18/05/2017.
 */

public class persona {
    public String nombre;
    private String mail;
    private String ltrabajo;
    private String direccion;
    private String telefono;
    private String obser;

    public persona(String cnombre, EditText mail, EditText lTrabajo, EditText domicilio, EditText telefono, EditText obser) {
    }

    public persona(String nombre, String mail, String ltrabajo, String direccion, String telefono, String obser) {
        this.nombre = nombre;
        this.mail = mail;
        this.ltrabajo = ltrabajo;
        this.direccion = direccion;
        this.telefono = telefono;
        this.obser = obser;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getLtrabajo() {
        return ltrabajo;
    }

    public void setLtrabajo(String ltrabajo) {
        this.ltrabajo = ltrabajo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTrabajo() {
        return obser;
    }

    public void setTrabajo(String trabajo) {
        this.obser = trabajo;
    }



}
