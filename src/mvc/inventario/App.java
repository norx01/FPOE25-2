package mvc.inventario;

public class App
{
    public static void main(String[] args)
    {
        MenuPrincipal menu = new MenuPrincipal();
        InventarioForm vistaRegistro = new InventarioForm();
        TablaInventarioForm vistaTabla = new TablaInventarioForm();

        InventarioControlador controlador = new InventarioControlador(menu, vistaRegistro, vistaTabla);
        controlador.iniciar();
    }
}