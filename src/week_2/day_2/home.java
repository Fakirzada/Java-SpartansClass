package week_2.day_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class home extends  JFrame {

    private JPanel panel;
    private JTextField txtbo1;
    private JTextField txtbox2;
    private JButton btnClik;
    private JTextField txtResult;


    public home() {
        btnClik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JOptionPane.showMessageDialog(btnClik,txtbo1.getText()+"HelLo World");

               String txRe= txtResult.getText();
                String txt1=txtbo1.getText();
                String txt2=txtbox2.getText();
                txRe=txt2+txt1;
            }
        });
    }

     public static void main(String[] args) {

        home h = new home();
        h.setContentPane(h.panel);
        h.setTitle("Hello Java");
        h.setSize(200,300);
        h.setVisible(true);
        h.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}
