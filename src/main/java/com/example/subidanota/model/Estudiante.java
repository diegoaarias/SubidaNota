package com.example.subidanota.model;

public class Estudiante {
    private String nombre,apellido,correo,telefono,direccion,sobre;
    private Double notaMedia;
    private boolean aprobado;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(Double notaMedia) {
        this.notaMedia = notaMedia;
    }

    public boolean isAprobado(Double notaMedia) {
        if(notaMedia>=5.0){
            return true;
        }else{
            return false;
        }
    }

    public void setAprobado(boolean aprobado) {
        this.aprobado = aprobado;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSobre() {
        return sobre;
    }

    public void setSobre(String sobre) {
        this.sobre = sobre;
    }

    public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, String correo, String telefono,String direccion, String sobre, Double notaMedia, boolean aprobado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sobre = sobre;
        this.notaMedia = notaMedia;
        this.aprobado = aprobado;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
