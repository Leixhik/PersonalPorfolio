import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Aplicación de Salud");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton botonIMC = new JButton("1. Indice de Masa Corporal");
        JButton botonEjercicios = new JButton("2. Ejercicios en Casa");
        JButton botonPesoIdeal = new JButton("3. Peso Ideal");
        JButton botonConsejosSalud = new JButton("4. Consejos de Salud");
        JButton botonSalir = new JButton("5. Salir de la App");

        botonIMC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Código para calcular el IMC
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu peso en kg:"));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu altura en metros:"));
                double imc = peso / (altura * altura);
                JOptionPane.showMessageDialog(frame, "Tu IMC es: " + imc);
            }
        });

        botonEjercicios.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Código para mostrar ejercicios
                JFrame ejerciciosFrame = new JFrame("Ejercicios en Casa");
                ejerciciosFrame.setSize(400, 300);
                ejerciciosFrame.setLayout(new GridLayout(4, 1));

                JButton botonBrazos = new JButton("2.1 Brazos");
                JButton botonPernas = new JButton("2.2 Piernas");
                JButton botonHombros = new JButton("2.3 Hombros");
                JButton botonPecho = new JButton("2.4 Pecho");

                // Ejercicios Brazos

                botonBrazos.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Código para mostrar la lista de ejercicios de brazos
                        String[] ejerciciosBrazos = {
                                "Ejercicio 1: Flexiones de brazos",
                                "Ejercicio 2: Curl de bíceps",
                                "Ejercicio 3: Tríceps en banco",
                                // Agregar más ejercicios según sea necesario
                        };
                        JList<String> listaEjercicios = new JList<>(ejerciciosBrazos);
                        JScrollPane scrollPane = new JScrollPane(listaEjercicios);
                        ejerciciosFrame.getContentPane().removeAll();
                        ejerciciosFrame.getContentPane().add(scrollPane);
                        ejerciciosFrame.revalidate();
                        ejerciciosFrame.repaint();
                    }
                });

                //Ejercicios Piernas

                botonPernas.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Código para mostrar la lista de ejercicios de brazos
                        String[] ejerciciosPernas = {
                                "Ejercicio 1: Flexiones de brazos",
                                "Ejercicio 2: Curl de bíceps",
                                "Ejercicio 3: Tríceps en banco",
                                // Agregar más ejercicios según sea necesario
                        };
                        JList<String> listaEjercicios = new JList<>(ejerciciosPernas);
                        JScrollPane scrollPane = new JScrollPane(listaEjercicios);
                        ejerciciosFrame.getContentPane().removeAll();
                        ejerciciosFrame.getContentPane().add(scrollPane);
                        ejerciciosFrame.revalidate();
                        ejerciciosFrame.repaint();
                    }
                });

                //Ejercicios Hombros

                botonBrazos.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Código para mostrar la lista de ejercicios de brazos
                        String[] ejerciciosBrazos = {
                                "Ejercicio 1: Flexiones de brazos",
                                "Ejercicio 2: Curl de bíceps",
                                "Ejercicio 3: Tríceps en banco",
                                // Agregar más ejercicios según sea necesario
                        };
                        JList<String> listaEjercicios = new JList<>(ejerciciosBrazos);
                        JScrollPane scrollPane = new JScrollPane(listaEjercicios);
                        ejerciciosFrame.getContentPane().removeAll();
                        ejerciciosFrame.getContentPane().add(scrollPane);
                        ejerciciosFrame.revalidate();
                        ejerciciosFrame.repaint();
                    }
                });

                //Ejercicios Pecho

                botonBrazos.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        // Código para mostrar la lista de ejercicios de brazos
                        String[] ejerciciosBrazos = {
                                "Ejercicio 1: Flexiones de brazos",
                                "Ejercicio 2: Curl de bíceps",
                                "Ejercicio 3: Tríceps en banco",
                                // Agregar más ejercicios según sea necesario
                        };
                        JList<String> listaEjercicios = new JList<>(ejerciciosBrazos);
                        JScrollPane scrollPane = new JScrollPane(listaEjercicios);
                        ejerciciosFrame.getContentPane().removeAll();
                        ejerciciosFrame.getContentPane().add(scrollPane);
                        ejerciciosFrame.revalidate();
                        ejerciciosFrame.repaint();
                    }
                });

                // Repite el código anterior para los otros botones de ejercicios

                ejerciciosFrame.add(botonBrazos);
                ejerciciosFrame.add(botonPernas);
                ejerciciosFrame.add(botonHombros);
                ejerciciosFrame.add(botonPecho);

                ejerciciosFrame.setVisible(true);
            }
        });

        botonPesoIdeal.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Código para calcular el peso ideal
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu peso actual en kg:"));
                double altura = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu altura en metros:"));
                double pesoIdeal = 24.9 * (altura * altura);
                JOptionPane.showMessageDialog(frame, "Tu peso ideal es: " + pesoIdeal + " kg");
            }
        });

        botonConsejosSalud.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Código para mostrar consejos de salud
                String[] consejos = {
                        "Consejo 1: Bebe suficiente agua todos los días.",
                        "Consejo 2: Mantén una dieta equilibrada y rica en frutas y verduras.",
                        "Consejo 3: Realiza ejercicio regularmente.",
                        "Consejo 4: Duerme al menos 7-8 horas cada noche.",
                        "Consejo 5: Reduce el estrés y practica la relajación."
                };

                String consejosText = String.join("\n", consejos);
                JOptionPane.showMessageDialog(frame, consejosText, "Consejos de Salud", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        botonSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Cerrar la aplicación
                System.exit(0);
            }
        });

        frame.add(botonIMC);
        frame.add(botonEjercicios);
        frame.add(botonPesoIdeal);
        frame.add(botonConsejosSalud);
        frame.add(botonSalir);

        frame.setVisible(true);
    }
}
