package estructuras;

import javax.swing.*;

public class Vector
{
    //Para crear un vector en java se debe definir su tipo
    int[] numeros = new int[5];

    //Ver
    public void mostrarVector()
    {
        //Se crea un ciclo for para recorrer el vector
        for(int i=0;i<numeros.length; i++)
        {
            System.out.println(numeros[i]);
        }
    }

    //agregar valores al vector
    public void agregarVector()
    {
        for (int i = 0; i < numeros.length; i++)
        {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
            numeros[i] = valor;
        }
    }

    //Editar valores del vector
    public void editarVector()
    {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion"));
        numeros[posicion] = valor;
    }

    //Elimnar valor vector
    public void eliminarVector()
    {
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion"));
        numeros[posicion] = 0;
    }

    //Buscar valor en un vector
    public void buscarVector()
    {
        boolean encontrado = false;
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a buscar"));
        for (int i = 0; i < numeros.length; i++)
        {
            if (numeros[i] == valor)
            {
                JOptionPane.showMessageDialog(null,"El valor "+valor+" esta en la posicion "+i);
                encontrado = true;
                break;
            }
        }
        if (!encontrado)
        {
            JOptionPane.showMessageDialog(null,"El valor "+valor+" no esta en el vector");
        }
    }

    public void menu()
    {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1.Mostrar \n2.Agregar \n3.Editar \n4.Eliminar \n5.Buscar \n6.Salir"));
        switch (opcion)
        {
            case 1:
                mostrarVector();
                menu();
                break;
            case 2:
                agregarVector();
                menu();
                break;
            case 3:
                editarVector();
                menu();
                break;
            case 4:
                eliminarVector();
                menu();
                break;
            case 5:
                buscarVector();
                menu();
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Gracias por usar nuestro sistema :D");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Opcion invalida");
                menu();
                break;
        }
    }

    public static void main(String[] args)
    {
        //Se crea el objeto de la clase "vector"
        Vector vector = new Vector();
        //Se invoca al metodo menu
        vector.menu();
    }
}
