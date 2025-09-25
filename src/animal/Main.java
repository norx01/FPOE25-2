package animal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main
{
    private JPanel mainPanel;
    private JButton agregarAnimalesButton;
    private JButton listadoDeAnimalesButton;

    //Se crea un objeto de animales
    private Animales animales = new Animales();

    public Main()
    {
        agregarAnimalesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                animales.mostrar();
            }
        });

        listadoDeAnimalesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {

            }
        });
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame();
        frame.setContentPane(new Main().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setSize(300,300);
    }
}
