package estructuras;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayLista
{
    //Se crea el arraylist para almacenar los datos
    List<Integer> numeros = new ArrayList<>();

    //Mostar datos de la lista
    //get(indice) metodo para obtener un valor de la lista
    public void mostrarLista()
    {
        for (int i = 0; i < numeros.size(); i++)
        {
            System.out.println(numeros.get(i));
        }
    }

    //agregar datos a la lista
    //add(valor) metodo para agregar un valor a la lista
    public void agregarLista()
    {
        //cantidad de datos a agregar a la lista - uso opcional
       int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de datos de lalista"));

       //ciclo for para agregar la cantidad de datos
        for (int i = 0; i < cantidad; i++)
        {
            int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
            numeros.add(valor);
        }
    }

    //Editar datos de la lista
    //set(indice, valor)
    public void editarLista()
    {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un valor"));
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion"));
        numeros.set(posicion, valor);
    }

    //eliminar dato de la lista
    //remove(indice)
    public void eliminarLista()
    {
        int posicion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion"));
        numeros.remove(posicion);

        //remove(indice): eliminar dato en la posicion
        //remove(valor): eliminar dato en la lista
        //clear(): elimina todos los datos
    }

    //buscar dato en la lista
    //contains(valor): verificar si existe un dato en la lista
    //indexOf(valor): verificar la posicion de un dato en la lista
    public void buscarLista()
    {
        int valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor a buscar"));
        boolean encontrado = numeros.contains(valor);
        int posicion = numeros.indexOf(valor);
        if (encontrado)
        {
            JOptionPane.showMessageDialog(null,"El valor "+valor+" se encuentra en la lista en la posicion "+posicion);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"El valor "+valor+" no se encuentra en la lista");
        }
    }

    public void menu()
    {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1.Mostrar \n2.Agregar \n3.Editar \n4.Eliminar \n5.Buscar \n6.Salir"));
        switch (opcion)
        {
            case 1:
                mostrarLista();
                menu();
                break;
            case 2:
                agregarLista();
                menu();
                break;
            case 3:
                editarLista();
                menu();
                break;
            case 4:
                eliminarLista();
                menu();
                break;
            case 5:
                buscarLista();
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
        ArrayLista lista = new ArrayLista();
        lista.menu();
    }


}
