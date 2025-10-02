package mvc.inventario;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class InventarioControlador
{
    private MenuPrincipal menu;
    private InventarioForm vistaRegistro;
    private TablaInventarioForm vistaTabla;
    private JFrame frame;
    private List<Producto> inventario;
    private DefaultTableModel modeloTabla;

    public InventarioControlador(MenuPrincipal menu, InventarioForm vistaRegistro, TablaInventarioForm vistaTabla) {
        this.menu = menu;
        this.vistaRegistro = vistaRegistro;
        this.vistaTabla = vistaTabla;
        this.inventario = new ArrayList<>();

        // Configurar tabla
        modeloTabla = new DefaultTableModel(new Object[]{"Nombre", "Precio", "Cantidad"}, 0);
        vistaTabla.tablaProductos.setModel(modeloTabla);

        // Eventos del menú
        menu.btnRegistrar.addActionListener(e -> mostrarVista(vistaRegistro.getMainPanel()));
        menu.btnVerInventario.addActionListener(e -> {
            actualizarTabla();
            mostrarVista(vistaTabla.getMainPanel());
        });

        // Eventos vista registro
        vistaRegistro.btnAgregar.addActionListener(e -> {
            String nombre = vistaRegistro.txtNombre.getText();
            double precio = Double.parseDouble(vistaRegistro.txtPrecio.getText());
            int cantidad = Integer.parseInt(vistaRegistro.txtCantidad.getText());

            Producto producto = new Producto(nombre, precio, cantidad);
            inventario.add(producto);

            JOptionPane.showMessageDialog(frame, "Producto agregado correctamente");

            vistaRegistro.txtNombre.setText("");
            vistaRegistro.txtPrecio.setText("");
            vistaRegistro.txtCantidad.setText("");
        });

        vistaRegistro.btnVolver.addActionListener(e -> mostrarVista(menu.getMainPanel()));

        // Eventos vista tabla
        vistaTabla.btnVolver.addActionListener(e -> mostrarVista(menu.getMainPanel()));
    }

    private void actualizarTabla()
    {
        modeloTabla.setRowCount(0); // limpiar tabla
        for (Producto p : inventario)
        {
            modeloTabla.addRow(new Object[]{p.getNombre(), p.getPrecio(), p.getCantidad()});
        }
    }

    public void iniciar()
    {
        frame = new JFrame("Sistema de Inventario - MVC");
        frame.setContentPane(menu.getMainPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void mostrarVista(JPanel panel)
    {
        frame.setContentPane(panel);
        frame.revalidate();
        frame.repaint();
    }
}
