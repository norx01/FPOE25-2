package mvc.estudianteClass;

public class Estudiante
{
    //Esta es mi clase Modelo

    private String nombre;
    private int edad;
    private int codigo;
    private String programa;

    public Estudiante(String nombre, int edad, int codigo, String programa)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.codigo = codigo;
        this.programa = programa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getPrograma() {
        return programa;
    }

    public void setPrograma(String programa) {
        this.programa = programa;
    }
}
