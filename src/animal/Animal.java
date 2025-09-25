package animal;

import java.util.ArrayList;
import java.util.List;

public class Animal
{
    private String nombre;
    private String raza;
    private int edad;
    private String tipoAmbiente;

    public Animal(String nombre, String raza, int edad, String tipoAmbiente)
    {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tipoAmbiente = tipoAmbiente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoAmbiente() {
        return tipoAmbiente;
    }

    public void setTipoAmbiente(String tipoAmbiente) {
        this.tipoAmbiente = tipoAmbiente;
    }

}
