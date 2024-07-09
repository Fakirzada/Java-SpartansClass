package week_2.day_2;

import javax.swing.*;

public class Main extends JFrame {
    public Main (){

        setTitle("Simple GUI App");
        setDefaultCloseOperation( EXIT_ON_CLOSE);
        setSize(300,400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
