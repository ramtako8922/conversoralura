import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {
        //Crendo Ventana
        JFrame frame=new JFrame("CONVERSOR");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);

        //Creado Menu superior
        JMenuBar mb=new JMenuBar();
        JMenu m1=new JMenu("CONVERSOR DE MONEDAS");
        JMenu m2=new JMenu("CONVERSOR DE TEMPERATURA");
        mb.add(m1);
        mb.add(m2);

        //Creando panel del seleccion del conversor
        JPanel panel=new JPanel();
        JMenuBar smb=new JMenuBar();
        JMenu sm=new JMenu("Seleccione la modena a convertir");
        JMenuItem sm1=new JMenuItem("Peso CO Dolar");
        JMenuItem sm2=new JMenuItem("Dolar Peso CO");
        JMenuItem sm3=new JMenuItem("Peso CO Euro");
        JMenuItem sm4=new JMenuItem("Euro Peso CO");
        JMenuItem sm5=new JMenuItem("Peso CO Libra Esterlina");
        JMenuItem sm6=new JMenuItem("Libra Esterlina Peso CO");
        JMenuItem sm7=new JMenuItem("Peso CO Yean");
        JMenuItem sm8=new JMenuItem("Yean Peso CO");
        JMenuItem sm9=new JMenuItem("Peso CO Yean");
        JMenuItem sm10=new JMenuItem("Peso CO Won");
        JMenuItem sm11=new JMenuItem(" Won Peso CO");
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
        smb.add(sm);
        panel.add(smb);







        frame.setVisible(true);

        //Agregando elementos al frame
        frame.getContentPane().add(BorderLayout.NORTH,mb);
        frame.getContentPane().add(BorderLayout.CENTER,panel);



        

    }
}
