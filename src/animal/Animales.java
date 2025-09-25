package animal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Animales {
    private JPanel mainPanel;
    private JTextField campoNombre;
    private JTextField campoRaza;
    private JTextField campoEdad;
    private JTextField campoTA;
    private JButton registrarAnimalButton;
    private JButton mostrarAnimalesButton;

    //Se crea una lista de animales
    List<Animal> animalList = new ArrayList<>();

    private Animal animal1;

    public Animales()
    {
        registrarAnimalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //captamos los datos de la GUI
                String nombre = campoNombre.getText();
                String raza = campoRaza.getText();
                int edad = Integer.parseInt(campoEdad.getText());
                String tipoAmbiente = campoTA.getText();
                //Creamos el objeto animal con los datos
                Animal animal = new Animal(nombre, raza, edad, tipoAmbiente);
                //Alimetamos la lista de animales
                animalList.add(animal);
                JOptionPane.showMessageDialog(null,"Animal registrado");
                limpiar();
            }
        });

        mostrarAnimalesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                mostrarAnimales();
            }
        });
    }

    public void limpiar()
    {
        campoNombre.setText("");
        campoRaza.setText("");
        campoEdad.setText("");
        campoTA.setText("");
    }
    public void mostrarAnimales()
    {
        for (Animal animal : animalList)
        {
            System.out.println("Animal:");
            System.out.println(animal.getNombre());
            System.out.println(animal.getRaza());
            System.out.println(animal.getEdad());
            System.out.println(animal.getTipoAmbiente());
        }
    }

    public void mostrar()
    {
        JFrame frame = new JFrame("Agregar Animales");
        frame.setContentPane(mainPanel);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500, 500);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
    }
}
