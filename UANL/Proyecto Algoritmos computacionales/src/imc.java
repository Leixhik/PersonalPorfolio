import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class imc {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Aplicación de Salud");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton botonIMC = new JButton("Indice de Masa Corporal");

        botonIMC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crear una ventana para el IMC
                JFrame imcFrame = new JFrame("Calculadora de IMC");
                imcFrame.setSize(300, 200);

                JPanel panel = new JPanel();
                imcFrame.add(panel);
                panel.setLayout(new GridLayout(3, 2));

                JLabel labelPeso = new JLabel("Peso (kg): ");
                JTextField textFieldPeso = new JTextField(10);
                JLabel labelEstatura = new JLabel("Estatura (m): ");
                JTextField textFieldEstatura = new JTextField(10);
                JButton calcularButton = new JButton("Calcular IMC");
                JLabel resultadoLabel = new JLabel("");

                panel.add(labelPeso);
                panel.add(textFieldPeso);
                panel.add(labelEstatura);
                panel.add(textFieldEstatura);
                panel.add(calcularButton);
                panel.add(resultadoLabel);

                calcularButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        try {
                            double peso = Double.parseDouble(textFieldPeso.getText());
                            double estatura = Double.parseDouble(textFieldEstatura.getText());
                            double imc = peso / (estatura * estatura);
                            resultadoLabel.setText("Tu IMC es: " + imc);
                        } catch (NumberFormatException ex) {
                            resultadoLabel.setText("Ingresa valores válidos");
                        }
                    }
                });

                imcFrame.setVisible(true);
            }
        });

        frame.add(botonIMC);
        frame.setVisible(true);
    }
}
