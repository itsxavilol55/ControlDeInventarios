import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class vista extends JFrame {
    private JTextField textField;
    private JButton button;

    public vista() {
        super("MVC");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        textField = new JTextField(20);
        panel.add(textField);
        button = new JButton("Mostrar");
        panel.add(button);
        getContentPane().add(panel);
        setVisible(true);
    }

    public String getText() {
        return textField.getText();
    }

    public void setText(String mensaje) {
        textField.setText(mensaje);
    }

    public void agregarListener(ActionListener listener) {
        button.addActionListener(listener);
    }
}
