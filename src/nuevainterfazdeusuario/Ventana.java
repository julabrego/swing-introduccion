package nuevainterfazdeusuario;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ventana extends JFrame {
    JLabel etiqueta;
    JTextField campoDeTexto;
    JPanel panel1;
    JTextArea textArea;
    JButton boton1;
    
    Ventana(){
        crearVentana();
        agregarElementosAVentana();
    }
    
    private void crearVentana(){
        // setVisible(true); // Es necesario hacer que sea visible. Llevarlo por fuera, luego de que se instancia Ventana
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Indicar comportamiento cuando se pide cerrar la ventana
        
        setSize(640, 480); // ANCHO y ALTO de la ventana en PIXELES
        //setLocation(450, 150); // Posición en coordenadas x, y (horizontal y vertical)
        //setBounds(450, 150, 640, 480); // Método que resume los dos anteriores
        setLocationRelativeTo(null); // Esto sirve para centrar la ventana en la pantalla
        
        setResizable(true); // Definir si el usuario puede o no modificar el tamaño de la ventana
        setMinimumSize(new Dimension(320, 240)); // Defino el tamaño más chico posible
        // setMaximumSize(new Dimension(800, 600)); // Defino el tamaño más grande posible
        
        //setMaximizedBounds(new Rectangle(800, 600)); // Defino el tamaño máximo maximizado
        
        //this.getContentPane().setBackground(Color.red); // Pinto el color de fondo. Para eso 
                                    // Necesito invocar a .getContentPane().
                                    
        panel1 = new JPanel();
        panel1.setLayout(null);
        add(panel1);
    }
    
    private void agregarElementosAVentana(){
        etiqueta = new JLabel("Soy un label");
        etiqueta.setBounds(10, 10, 200, 100);
        
        panel1.add(etiqueta);
        
        campoDeTexto = new JTextField();
        campoDeTexto.setBounds(10, 80, 150, 50);
        campoDeTexto.setText("Campo de texto de una sola línea");
        
        panel1.add(campoDeTexto);
        
        textArea = new JTextArea(10, 50);
        textArea.setBounds(10, 150, 300, 150);
        
        panel1.add(textArea);
        
        boton1 = new JButton("Click");
        boton1.setBounds(10, 310, 80, 30);
        
        panel1.add(boton1);
    }
}
