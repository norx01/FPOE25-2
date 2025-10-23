package estructuras;

import javax.swing.*;

public class Matrices
{
    //Definimos la matriz
    int[][] numeros = new int[3][3]; //Matriz cuadrada

    //Mostrar datos matriz
    public void mostrarMatriz()
    {
        //Definimos dos for anidados
        for (int i = 0; i < numeros.length; i++)
        {
            for (int j = 0; j < numeros[0].length; j++)
            {
                System.out.print(numeros[i][j]+" ");
            }
            System.out.println("");
        }
    }

    //Agregar datos Matriz
    public void agregarMatriz()
    {
        for (int i = 0; i < numeros.length; i++)
        {
            for (int j = 0; j < numeros[0].length; j++)
            {
                int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato de la pos ("+i+"-"+j+")"));
                numeros[i][j] = dato;
            }
        }
    }

    //Editar datos Matriz
    public void editarMatriz()
    {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion de la matriz (Columna)"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion de la matriz (Fila)"));
        int dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato para editar"));
        numeros[x][y] = dato;
    }

    //Eliminar datos Matriz
    public void eliminarMatriz()
    {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion de la matriz (Columna)"));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posicion de la matriz (Fila)"));
        numeros[x][y] = 0;
    }

    //
    public void buscarMatriz(){
        int numeroBuscado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a buscar"));
        boolean existe = false;

        for (int i = 0; i < numeros.length; i++){
            for (int j = 0; j < numeros[0].length; j++){
                if (numeros[i][j] == numeroBuscado){
                    JOptionPane.showMessageDialog(null, "El numero se encuentra en la matriz: "+i+"-"+j);
                    existe = true;
                }
            }
        }
        if (!existe){
            JOptionPane.showMessageDialog(null, "El numero no se encuentra en la matriz");
        }
    }

    public void menu()
    {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1.Mostrar \n2.Agregar \n3.Editar \n4.Eliminar \n5.Buscar \n0.Salir"));
        switch (opcion)
        {
            case 1:
                mostrarMatriz();
                break;
            case 2:
                agregarMatriz();
                break;
            case 3:
                editarMatriz();
                    break;
            case 4:
                eliminarMatriz();
                break;
            case 5:
                buscarMatriz();
                    break;
            case 0:
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                break;
        }
        menu();
    }

    public static void main(String[] args)
    {
        Matrices matrices = new Matrices();
      matrices.menu();
    }
}
