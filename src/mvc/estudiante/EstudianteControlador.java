package mvc.estudiante;

import java.awt.event.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EstudianteControlador
{
    private EstudianteForm vista;

    public EstudianteControlador(EstudianteForm vista)
    {
        this.vista = vista;

        this.vista.botonGuardar.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String nombre = vista.campoNombre.getText();
                int edad = Integer.parseInt(vista.campoEdad.getText());

                Estudiante estudiante = new Estudiante(nombre, edad);

                vista.areaResultado.append(
                        "Registrado: " + estudiante.getNombre() +
                                " (" + estudiante.getEdad() + " años)\n"
                );
            }
        });

        this.vista.campoEdad.addKeyListener(new KeyAdapter()
        {
            @Override
            public void keyPressed(KeyEvent e)
            {
                super.keyPressed(e);

            }
        });
    }
}