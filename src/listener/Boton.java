package listener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Boton {
    private JPanel mainPanel;
    private JButton button1;
    private JLabel texto;

    boolean estado = false;

    public Boton()
    {
        button1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                cambiarEstado();
                Toolkit.getDefaultToolkit().beep();
                //cambiarEstadoElegante();
            }
        });
    }

    public void cambiarEstadoElegante()
    {
        if (estado)
        {
            texto.setText("encendido");
            estado = false;
        }
        else
        {
            texto.setText("apagado");
            estado = true;
        }
    }

    public void cambiarEstado()
    {
        String text = texto.getText();
        if (text.equals("encendido"))
        {
            texto.setText("apagado");
        }
        else
        {
            texto.setText("encendido");
        }
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Boton");
        frame.setContentPane(new Boton().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(500,500);
    }
}
