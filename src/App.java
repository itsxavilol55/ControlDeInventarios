public class App {
    public static void main(String[] args) throws Exception {
        vista vista = new vista();
        modelo modelo = new modelo();
        conexion conexion = new conexion("ejemplo", "javier", "javi54321");
        controlador controlador = new controlador(vista, modelo);
        vista.setControlador(controlador);
    }
}
