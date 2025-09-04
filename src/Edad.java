import javax.swing.*;

public class Edad
{
    int edad, valor;

    public Edad(int edad, int valor)
    {
        this.edad = edad;
        this.valor = valor;
    }

    public void calcularDescuento()
    {
        double descuento = 0;
        double total = 0;
        String tipo = "";

        if (edad >= 1 && edad <= 15)
        {
            descuento = valor*0.1123;
            tipo = "niño";
        }
        else if (edad >= 16 && edad <= 18)
        {
            descuento = valor*0.2347;
            tipo = "adolecente";
        }
        else if (edad >= 19 && edad <= 30)
        {
            descuento = valor*0.3849;
            tipo = "Post-adolecente";
        }
        else if (edad >= 31 && edad <= 50)
        {
            descuento = valor*0.4123;
            tipo = "Adulto";
        }
        else if (edad >= 51 && edad <= 100)
        {
            descuento = valor*0.5517;
            tipo = "Adulto mayor";
        }
        else if (edad >= 101)
        {
            descuento = valor;
            tipo = "Adulto Remayor";
        }
        else
        {
            descuento = 0;
            tipo = "No existe";
        }

        total = valor-descuento;

        JOptionPane.showMessageDialog(null, "Clasificacion: "+tipo
        +"\nEl total sin descuento: "+valor+"\nEl descuento: "+descuento
        +"\nEl total con descuento: "+total);
    }

    public static void main(String[] args)
    {
        Edad edad = new Edad(15,100000);
        edad.calcularDescuento();
    }
}
