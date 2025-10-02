package mvc.biblioteca.controlador;

import mvc.biblioteca.modelo.Libro;
import mvc.biblioteca.vista.Busqueda;
import mvc.biblioteca.vista.Catalogo;
import mvc.biblioteca.vista.Formulario;
import mvc.biblioteca.vista.Menu;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaControlador
{
    JFrame frame;
    private Menu menu;
    private Formulario formulario;
    private Busqueda busqueda;
    private Catalogo catalogo;

    List<Libro> libroList;

    public BibliotecaControlador(Menu menu, Formulario formulario, Busqueda busqueda, Catalogo catalogo)
    {
        this.menu = menu;
        this.formulario = formulario;
        this.busqueda = busqueda;
        this.catalogo = catalogo;

        //Definiomos lista
        this.libroList = new ArrayList<>();

    }

    public void iniciar()
    {
        frame = new JFrame("Biblioteca - MVC");
        frame.setContentPane(menu.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
