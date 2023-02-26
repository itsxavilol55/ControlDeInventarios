import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class controlador implements ActionListener {
    private vista vista;
    private modelo modelo;
    public controlador(vista vista, modelo modelo) {
        this.vista=vista;
        this.modelo=modelo;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
