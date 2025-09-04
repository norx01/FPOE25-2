package adivinador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Adivinador
{
    private JPanel mainPanel;
    private JTextField campoAdivinar;
    private JButton adivinarButton;
    private JButton resetButton;
    private JLabel contador;

    int numAdivinar = 0;
    int vidas = 3;

    public Adivinador()
    {
        generarAleatorio();
        contador.setText("Sus vidas son: "+vidas);

        adivinarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                adivinar();
                contador.setText("Sus vidas son: "+vidas);
            }
        });

        resetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                reiniciar();
            }
        });
    }

    public void generarAleatorio()
    {
        //Se crea un objeto de la clase random para generar numeros aleatorios
        Random random = new Random();
        //Se genera un numero aleatorio entre 1 y 25
        numAdivinar =random.nextInt(25)+1;
        System.out.println(numAdivinar);
    }

    public void adivinar()
    {
        int numero = Integer.parseInt(campoAdivinar.getText());
        int diferencia = numAdivinar-numero;

        if (numero == numAdivinar)
        {
            JOptionPane.showMessageDialog(null,"Acertaste");
            mainPanel.setBackground(Color.green);
            adivinarButton.setEnabled(false);
        }
        else if (diferencia >= -5 && diferencia <= 5)
        {
            JOptionPane.showMessageDialog(null,"Caliente");
            mainPanel.setBackground(Color.red);
            vidas--;
        }
        else if (diferencia >= -10 && diferencia <= 10)
        {
            JOptionPane.showMessageDialog(null,"Tibio");
            mainPanel.setBackground(Color.orange);
            vidas--;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Frio");
            mainPanel.setBackground(Color.blue);
            vidas--;
        }

        if (vidas == 0)
        {
            JOptionPane.showMessageDialog(null,"Perdiste");
            mainPanel.setBackground(Color.black);
            adivinarButton.setEnabled(false);
        }
    }

    public void reiniciar()
    {
        vidas = 3;
        generarAleatorio();
        mainPanel.setBackground(Color.lightGray);
        adivinarButton.setEnabled(true);
        campoAdivinar.setText("");
        contador.setText("Sus vidas son: "+vidas);
    }


    public static void main(String[] args)
    {
        //Se crea el objeto frame que es el marco de la aplicacion
        JFrame frame = new JFrame("Adivinador");
        //Se coloca el panel principal en el marco
        frame.setContentPane(new Adivinador().mainPanel);
        //Se establece que al cerrar la aplicacion se termine la ejecucion
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Se establece que todos los elementos se acomoden en el panel
        frame.pack();
        //Se establece que el marco sea visible
        frame.setVisible(true);
        //Se establece que el marco no pueda ser redimensionado
        frame.setResizable(false);
        //Se establece el tamaño del marco
        frame.setSize(500,400);
    }
}
