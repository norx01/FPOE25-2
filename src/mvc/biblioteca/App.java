package mvc.biblioteca;

import mvc.biblioteca.controlador.BibliotecaControlador;
import mvc.biblioteca.vista.Busqueda;
import mvc.biblioteca.vista.Catalogo;
import mvc.biblioteca.vista.Formulario;
import mvc.biblioteca.vista.Menu;

import java.awt.*;

public class App
{
    public static void main(String[] args)
    {
        Menu menu = new Menu();
        Formulario formulario = new Formulario();
        Busqueda busqueda = new Busqueda();
        Catalogo catalogo = new Catalogo();

        BibliotecaControlador controlador = new BibliotecaControlador(menu, formulario, busqueda, catalogo);
        controlador.iniciar();
    }
}
