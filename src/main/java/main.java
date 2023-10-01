import servicios.Conversor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main {
        public static void main(String[] args) {
                Conversor conversor = new Conversor();
                //Crendo Ventana
                JFrame frame = new JFrame("CONVERSOR");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(400, 400);


                //Creando panel del seleccion del conversor gb




                //Agregando elementos al frame


                JPanel panel = new JPanel();
                JMenuBar smb = new JMenuBar();
                JMenu sm = new JMenu("Seleccione la modena a convertir");
                JMenuItem sm1 = new JMenuItem("Peso CO Dolar");
                JMenuItem sm2 = new JMenuItem("Dolar Peso CO");
                JMenuItem sm3 = new JMenuItem("Peso CO Euro");
                JMenuItem sm4 = new JMenuItem("Euro Peso CO");
                JMenuItem sm5 = new JMenuItem("Peso CO Libra Esterlina");
                JMenuItem sm6 = new JMenuItem("Libra Esterlina Peso CO");
                JMenuItem sm7 = new JMenuItem("Peso CO Yean");
                JMenuItem sm8 = new JMenuItem("Yean Peso CO");
                JMenuItem sm9 = new JMenuItem("Peso CO Yean");
                JMenuItem sm10 = new JMenuItem("Peso CO Won");
                JMenuItem sm11 = new JMenuItem(" Won Peso CO");
                JMenuItem sm12 = new JMenuItem(" Grados °C a grados °K");
                JMenuItem sm13 = new JMenuItem(" Grados °K a grados °C");
                JMenuItem sm14 = new JMenuItem(" Grados °C a grados °F");
                sm.add(sm1);
                sm.add(sm2);
                sm.add(sm3);
                sm.add(sm4);
                sm.add(sm5);
                sm.add(sm6);
                sm.add(sm7);
                sm.add(sm8);
                sm.add(sm9);
                sm.add(sm10);
                sm.add(sm11);
                sm.add(sm12);
                sm.add(sm13);
                sm.add(sm14);
                smb.add(sm);
                panel.add(smb);


                sm1.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                conversor.convertirPesosDolar();

                        }
                });
                sm2.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                conversor.convertirDolarPesos();
                        }
                });
                sm3.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                conversor.convertirPesosEuro();
                        }
                });
                sm4.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                conversor.convertirEuroPesos();
                        }
                });

                sm5.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                conversor.convertirPesosLibra();
                        }
                });
                sm6.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                                conversor.convertirPesosLibra();
                        }
                });
                sm7.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                conversor.convertirLibraPesos();
                        }
                });
                sm8.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                conversor.convertirPesosYean();
                        }
                });
                sm9.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                conversor.convertirYeanPesos();
                        }
                });
                sm10.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                conversor.convertirPesosWon();
                        }
                });
                sm11.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                conversor.convertirWonPesos();
                        }
                });

                sm12.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                conversor.convertirCentigradosKelvin();
                        }
                });

                sm13.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                conversor.convertirKelvinCentigrados();
                        }
                });

                sm14.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                                conversor.convertirCentigradosFarenheiht();
                        }
                });

                frame.getContentPane().add(BorderLayout.CENTER, panel);
                frame.setVisible(true);
        }

}








