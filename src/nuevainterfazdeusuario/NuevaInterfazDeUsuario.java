package nuevainterfazdeusuario;

public class NuevaInterfazDeUsuario {

    public static void main(String[] args) {
        // Instancia de objeto Ventana
        Ventana ventana1 = new Ventana();
        
        // Es importante hacer visible a la instancia, porque si se le da la instrucción desde el constructor tiene algunos comportamientos raros
        ventana1.setVisible(true);
    }
    
}
