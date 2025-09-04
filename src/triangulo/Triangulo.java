package triangulo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Triangulo
{
    private JPanel mainPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton clasificarButton;

    public Triangulo()
    {
        clasificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                clasificarTriangulo();
            }
        });
    }

    public void clasificarTriangulo()
    {
        int lado1 = Integer.parseInt(textField1.getText());
        int lado2 = Integer.parseInt(textField2.getText());
        int lado3 = Integer.parseInt(textField3.getText());

        if (lado1 == lado2 && lado1 == lado3)
        {
            JOptionPane.showMessageDialog(null,"Es un triangulo equilatero");
        }
        else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3)
        {
            JOptionPane.showMessageDialog(null,"Es un triangulo escaleno");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Es un triangulo isosceles");
        }
    }

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Triangulo");
        frame.setContentPane(new Triangulo().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(500,500);
    }
}
