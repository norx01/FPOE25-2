package estructuras;

import javax.swing.*;
import java.util.Stack;

public class Pilas
{
    //Definimos la pila
    Stack<Integer> pila = new Stack<>();
    int tope = 0;
    int top = 0;

    //Agregar
    public void agregar()
    {
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un dato: "));
        pila.push(dato);
    }

    //Eliminar
    public void eliminar()
    {
        top = pila.pop();
        JOptionPane.showMessageDialog(null,"El top de la pila es: "+top);

    }

    //mostrar
    public void mostrar()
    {
        tope = pila.peek();
        JOptionPane.showMessageDialog(null,"El tope de la pila es: "+tope);

    }

    //validar si esta vacia
    public void estaVacia()
    {
        if (pila.empty())
        {
            JOptionPane.showMessageDialog(null,"La pila esta vacia");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"La pila contiene elementos");
        }
    }

    public void menu()
    {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1.Agregar \n2.Eliminar \n3.Mostrar \n4.Validar si esta vacia \n5.Salir"));
        switch (opcion)
        {
            case 1:
                agregar();
                break;
            case 2:
                eliminar();
                break;
            case 3:
                mostrar();
                break;
            case 4:
                estaVacia();
                break;
            case 0:
                System.exit(0);
                break;
        }
        menu();
    }

    public static void main(String[] args) {
        Pilas pilas = new Pilas();
        pilas.menu();
    }

}
