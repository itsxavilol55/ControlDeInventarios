public class App {
    public static void main(String[] args) throws Exception {
        vista vista = new vista();
        modelo modelo = new modelo();
        controlador controlador = new controlador(vista,modelo);
    }
}
