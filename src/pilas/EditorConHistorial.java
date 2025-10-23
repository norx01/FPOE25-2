package pilas;

import javax.swing.*;
import java.util.Stack;

public class EditorConHistorial
{
    private Stack<String> historialDeshacer = new Stack<>();
    private Stack<String> historialRehacer = new Stack<>();
    private String textoActual = "";
    public void escribir()
    {
        String nuevoTexto = JOptionPane.showInputDialog("Ingrese texto: ");
        historialDeshacer.push(textoActual);
        textoActual = nuevoTexto;
        historialRehacer.clear(); // Limpiar redo al hacer cambio nuevo
    }

    public void deshacer()
    { if(!historialDeshacer.isEmpty())
        {
            historialRehacer.push(textoActual);
            textoActual = historialDeshacer.pop();
        }
        JOptionPane.showMessageDialog(null, textoActual);
    }

    public void rehacer()
    {
        if(!historialRehacer.isEmpty())
        {
            historialDeshacer.push(textoActual);
            textoActual = historialRehacer.pop();
        }
        JOptionPane.showMessageDialog(null, textoActual);

    }

    public void menu()
    {
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("1.ingresar texto \n2.rehacer \n3.deshacer \n5.Salir"));
        switch (opcion)
        {
            case 1:
                escribir();
                break;
            case 2:
                rehacer();
                break;
            case 3:
                deshacer();
                break;
            case 0:
                System.exit(0);
                break;
        }
        menu();
    }




    public static void main(String[] args)
    {
        EditorConHistorial editor = new EditorConHistorial();
        editor.menu();
    }
}


