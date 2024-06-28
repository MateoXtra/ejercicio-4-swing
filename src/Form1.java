import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form1 {
    private JFormattedTextField formattedTextField1;
    private JPasswordField contra1;
    private JButton loginButton;
    private JLabel contratxt;
    private JLabel usuariotxt;
    public JPanel mainPanel;


    public Form1() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Este es el boton de Login\n");
                JFrame frame = new JFrame("Bienvenido");
                frame.setContentPane(new Form3().menu3);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(800, 600);
                frame.setPreferredSize(new Dimension(800, 600));
                frame.setMinimumSize(new Dimension(800, 600));
                frame.pack();

            }
        });
    }
}
