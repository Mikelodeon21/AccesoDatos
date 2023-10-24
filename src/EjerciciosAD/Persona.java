package EjerciciosAD;

import java.io.*;

public class Persona {
        String nombre;
        String dni;
        int id;
        int edad;

    public Persona(String nombre, String dni, int  id, int edad) throws IOException {
        this.nombre = nombre;
        this.dni = dni;
        this.id = id;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
